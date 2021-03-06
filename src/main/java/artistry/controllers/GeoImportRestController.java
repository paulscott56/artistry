package artistry.controllers;

import artistry.configuration.StorageProperties;
import artistry.services.ArtistryCsvReader;
import artistry.utils.DownloadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Configuration
@RestController
@Description("Controller to simplify the import of the geo data")
@RequestMapping("/geo")
class GeoImportRestController {

	private static final String RESOURCE = StorageProperties.getLocation(); //"/artistry/data/csv/";

	private static final Logger log = LoggerFactory.getLogger(GeoImportRestController.class);

	@Autowired
	private ArtistryCsvReader csvReader;

	@Autowired
	private DownloadService downloader;

	@RequestMapping(value = "/import", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String importData() {
		try {
			csvReader.readAllCountriesCsv();
			return "Data import has been completed!";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/setup", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String setup() {
		try {
			csvReader.createPlanetEarth();
			csvReader.readCountryInfoCsv();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "done";
	}

	@RequestMapping(value = "/importbycode", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String importDataByCode(@RequestParam("code") String code) {

		try {
			String data = downloader.download("http://download.geonames.org/export/dump/" + code + ".zip", code);
			FileInputStream fis = new FileInputStream(data);

			ZipInputStream zis = new ZipInputStream(fis);
			ZipEntry zipEntry = zis.getNextEntry();

			byte[] buffer = new byte[1024];
			while (zipEntry != null) {
				File destPath = new File(RESOURCE + zipEntry.getName());
				destPath.createNewFile();
				FileOutputStream fos = new FileOutputStream(destPath, false);
				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.close();
				zipEntry = zis.getNextEntry();
			}
			zis.closeEntry();
			zis.close();

			// clean up
			new File(RESOURCE + code + ".zip").delete();
			new File(RESOURCE + "readme.txt").delete();

			csvReader.readCountryByCode(code);

			// finally delete the file info as well
			new File(RESOURCE + code + ".txt").delete();

			return "Country: " + code + " has been imported";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/importcities", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String importDataByCity() {

		try {
			List<String> downloadfiles = Arrays.asList("cities1000.zip", "cities15000.zip", "cities500.zip",
					"cities5000.zip");

			for (String file : downloadfiles) {
				String data = downloader.download("http://download.geonames.org/export/dump/" + file,
						file.replace(".zip", ""));
				FileInputStream fis = new FileInputStream(data);
				ZipInputStream zis = new ZipInputStream(fis);
				ZipEntry zipEntry = zis.getNextEntry();

				byte[] buffer = new byte[1024];
				while (zipEntry != null) {
					File destPath = new File(RESOURCE + zipEntry.getName());
					destPath.createNewFile();
					FileOutputStream fos = new FileOutputStream(destPath, false);
					int len;
					while ((len = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					}
					fos.close();
					zipEntry = zis.getNextEntry();
				}
				zis.closeEntry();
				zis.close();

				csvReader.readCity(file.replace(".zip", ""));

				// finally delete the file info as well
				new File(RESOURCE + file.replace(".zip", "") + ".txt").delete();
				new File(RESOURCE + file).delete();
				log.info("Cities: " + file + " has been imported");
			}
			return "Cities have been imported!";

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}