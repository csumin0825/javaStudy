import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		// AutoClosable close를 자동으로 실행
		// try with resource statements
		try(FileWriter f = new FileWriter("data.txt")){
			f.write("Hello");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
