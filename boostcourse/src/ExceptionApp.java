
public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {			
			System.out.println(2);
//			System.out.println(scores[3]); // 예외를 찾으면 나감
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e ) {
			System.out.println("Arithmetic Exception"+e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("먼가 이상함");
		}
		System.out.println(3);
	}
}
