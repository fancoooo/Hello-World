package collectionlambda;
import java.util.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.*;
import java.nio.file.*;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.FileSystem;
public class FileException {
	public static void main(String[] args) throws IOException, URISyntaxException {
		/*char[] buff = new char[10];
		int length;
		try(Reader reader = new FileReader("CN.txt")){
			while((length = reader.read(buff))!= -1) {
				for(int i=0;i<length;i++){
					System.out.print(buff[i]);
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}*/
		/*Reader re = new FileReader("CN.txt");
		BufferedReader a= new BufferedReader(re);
		String value;
		while((value = a.readLine())!=null) {
			System.out.println(value+" "+a.readLine()+" "+a.readLine()+" "+a.readLine());
		}*/
		/*List<String> a = Files.readAllLines(Paths.get("CN.txt"));
		for(String e:a) {
			System.out.println(e);
		}
		BufferedReader b = Files.newBufferedReader(Paths.get("CN.txt"));*/
		/*try(FileSystem zipFs = openzip(Paths.get("Data.zip"))){
			copy(zipFs);
		} catch(Exception e) {
			System.out.println(e.getClass().getSimpleName() + " = " );
		}
	}
	private static FileSystem openzip(Path path) throws IOException, URISyntaxException {
		Map<String, String> a = new HashMap<>();
		a.put("create", "true");
		FileSystem zips = FileSystems.newFileSystem(new URI("jar:file",path.toUri().getPath(),null), a);
		return zips;
	}
	
	private static void copy(FileSystem zis) throws IOException, URISyntaxException {
		Path a = Paths.get("CN.txt");
		Path b = zis.getPath("/TEXT.txt");
		Files.copy(a, b, StandardCopyOption.REPLACE_EXISTING);
	}*/
		SortedMap<String, String> a = new TreeMap<>();
		a.put("1111", "a");
		a.put("82", "V");
		a.put("52", "c");
		a.put("28", "s");
		a.forEach( (k,v) -> {
			System.out.println(k + " " + v);
		});
	}
}