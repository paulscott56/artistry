package artistry.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.services.GeoCsvReader;
import artistry.utils.DownloadService;

@Configuration
@RestController
@Description("Controller to simplify the import of the geo data")
@RequestMapping("/geo")
public class GeoImportController {

	static final Logger log = LoggerFactory.getLogger(GeoImportController.class);

	@Autowired
	private GeoCsvReader csvReader;

	@Autowired
	private DownloadService downloader;

	@RequestMapping(value = "/import", method = RequestMethod.GET)
	@ResponseBody
	public String importData() throws IOException, URISyntaxException, ParseException {
		try {
			csvReader.readAllCountriesCsv();
			return "Data import has been completed!";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/setup", method = RequestMethod.GET)
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

	@RequestMapping(value = "/importbycode", method = RequestMethod.GET)
	@ResponseBody
	public String importDataByCode(@RequestParam("code") String code)
			throws IOException, URISyntaxException, ParseException {

		try {
			String data = downloader.download("http://download.geonames.org/export/dump/" + code + ".zip", code);
			FileInputStream fis = new FileInputStream(data);

			ZipInputStream zis = new ZipInputStream(fis);
			ZipEntry zipEntry = zis.getNextEntry();

			byte[] buffer = new byte[1024];
			while (zipEntry != null) {
				File destPath = new File(ClassLoader.getSystemResource("csv/").getFile() + zipEntry.getName());
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
			new File(ClassLoader.getSystemResource("csv/").getFile() + code + ".zip").delete();
			new File(ClassLoader.getSystemResource("csv/").getFile() + "readme.txt").delete();

			csvReader.readCountryByCode(code);

			// finally delete the file info as well
			new File(ClassLoader.getSystemResource("csv/").getFile() + code + ".txt").delete();

			return "Country: " + code + " has been imported";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/importcities", method = RequestMethod.GET)
	@ResponseBody
	public String importDataByCity() throws IOException, URISyntaxException, ParseException {

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
					File destPath = new File(ClassLoader.getSystemResource("csv/").getFile() + zipEntry.getName());
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
				new File(ClassLoader.getSystemResource("csv/").getFile() + file.replace(".zip", "") + ".txt").delete();
				new File(ClassLoader.getSystemResource("csv/").getFile() + file).delete();
				log.info("Cities: " + file + " has been imported");
			}
			return "Cities have been imported!";

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
