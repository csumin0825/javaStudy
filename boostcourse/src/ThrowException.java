import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {
	// FileWriter에서 예외가 발생하면 사용하는 쪽에서 try-catch를 요구받는다.
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("./data.txt");
	}
}
