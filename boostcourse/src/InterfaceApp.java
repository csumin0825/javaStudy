// sum이라는 메소드 필요 
// 입력값, 리턴값이 int
interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}
// interface로 규격을 전달

// RealCal을 제작할 때 규격을 따라 전
class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!");
	}
}

interface Printable{
	void print();
}

public class InterfaceApp {
	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스를 만들어주세요.
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}

}
