class Cal{
	int v1,v2;
	Cal(int v1, int v2){
		System.out.println("Cal init!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+this.v2;}
}
// 부모가 생성자가 있으면 자식클래스도 부모 생성자를 따라야함. 
class Cal3 extends Cal{

	Cal3(int v1, int v2) {
		super(v1, v2); // 부모클래스의 생성
		System.out.println("Cal3 init!");
	}
	public int minus() {return this.v1-this.v2;}
} 

public class InheritanceApp{
	public static void main(String[] args) {
		Cal c = new Cal(2,1);
		
		Cal3 c3 = new Cal3(3,1);
		System.out.println(c3.sum());
		System.out.println(c3.minus());
	}

}
