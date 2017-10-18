package collectionlambda;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadProreti {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		read(pro);
		System.out.println(pro.getProperty("acc"));
		System.out.println(pro.get("display"));
		System.out.println(System.getenv(""));
	}
	private static Properties read(Properties pro) throws IOException{
		Path path = Paths.get("sex.xml");
		if(Files.exists(path)) {
			try(InputStream in = Files.newInputStream(path)){
				pro.loadFromXML(in);
			}
		}
		return pro;
	}
}
