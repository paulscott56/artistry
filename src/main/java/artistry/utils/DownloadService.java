package artistry.utils;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DownloadService {

	static final Logger log = LoggerFactory.getLogger(DownloadService.class);

	private URL u;
	private InputStream is = null;
	private DataInputStream dis;
	private String s;
	private String url;

	public DataInputStream downloadFile(String url) {
		try {
			u = new URL(url);
			is = u.openStream();
			dis = new DataInputStream(new BufferedInputStream(is));
			return dis;
		} catch (MalformedURLException mue) {
			log.error(mue.getLocalizedMessage());
			System.exit(2);
		} catch (IOException ioe) {
			log.error(ioe.getLocalizedMessage());
			System.exit(3);
		} finally {
			try {
				is.close();
			} catch (IOException ioe) {
				log.error(ioe.getLocalizedMessage());
			}
		}
		return dis;

	}

}
