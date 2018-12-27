package artistry.services;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import artistry.models.geonames.GeoPlace;
import artistry.repositories.GeoRepository;

@Component
public class GeoCsvReader {

	@Autowired
	private GeoRepository geoRepo;

	public void readCsv() throws IOException, URISyntaxException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/allCountries.txt").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoPlace> csvToBean = new CsvToBeanBuilder<GeoPlace>(reader).withType(GeoPlace.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		Iterator<GeoPlace> geoIterator = csvToBean.iterator();
		while (geoIterator.hasNext()) {
			GeoPlace place = geoIterator.next();
			geoRepo.save(place);
		}
	}
}
