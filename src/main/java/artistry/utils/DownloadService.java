package artistry.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DownloadService {

	static final Logger log = LoggerFactory.getLogger(DownloadService.class);

	public File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
		File destFile = new File(destinationDir, zipEntry.getName());
		// destFile.createNewFile();

		// String destDirPath = destinationDir.getCanonicalPath();
		// String destFilePath = destFile.getCanonicalPath();

		// if (!destFilePath.startsWith(destDirPath + File.separator)) {
		// throw new IOException("Entry is outside of the target dir: " +
		// zipEntry.getName());
		// }

		return destFile;
	}

	public String download(String url, String code) throws IOException, URISyntaxException {
		URL zipfile = new URL(url);
		ReadableByteChannel rbc = Channels.newChannel(zipfile.openStream());
		URI p = ClassLoader.getSystemResource("csv/").toURI();
		String path = Paths.get(p).toString();
		String finalpath = path + "/" + code + ".zip";
		FileOutputStream fos = new FileOutputStream(finalpath);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		rbc.close();
		return finalpath;
	}
}
