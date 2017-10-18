package collectionlambda;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Propety {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		pro.setProperty("display", "viet");
		pro.setProperty("acc", "123-456");
		try(OutputStream wri = Files.newOutputStream(Paths.get("sex.xml"))){
			pro.storeToXML(wri, "comment", "UTF-8");
		}
	}
}
