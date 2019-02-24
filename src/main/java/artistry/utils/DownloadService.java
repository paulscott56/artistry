package artistry.utils;

import artistry.configuration.StorageProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.ZipEntry;

@Component
public class DownloadService {

	static final Logger log = LoggerFactory.getLogger(DownloadService.class);
	
	private static final String RESOURCE = StorageProperties.getLocation();

	public File newFile(File destinationDir, ZipEntry zipEntry) {
		// destFile.createNewFile();

		// String destDirPath = destinationDir.getCanonicalPath();
		// String destFilePath = destFile.getCanonicalPath();

		// if (!destFilePath.startsWith(destDirPath + File.separator)) {
		// throw new IOException("Entry is outside of the target dir: " +
		// zipEntry.getName());
		// }

		return new File(destinationDir, zipEntry.getName());
	}

	public String download(String url, String code) throws IOException {
		URL zipfile = new URL(url);
		ReadableByteChannel rbc = Channels.newChannel(zipfile.openStream());
		//URI p = ClassLoader.getSystemClassLoader().getResource("csv/").toURI();
		String finalpath = RESOURCE + "/" + code + ".zip";
		FileOutputStream fos = new FileOutputStream(finalpath);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		rbc.close();
		return finalpath;
	}
}
