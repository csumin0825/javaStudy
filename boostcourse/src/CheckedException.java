import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("HELLO");
			// close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 합니다.
//			f.close();
		}catch(IOException e) {
			e.printStackTrace();
		}finally { // 예외가 발생해도 무조건 실행
			// 만약 f가 null이 아니라면 close;
			if(f != null) {
				try {
					f.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
