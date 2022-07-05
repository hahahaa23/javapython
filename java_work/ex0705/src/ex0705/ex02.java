package ex0705;

public class ex02 {

	public static void main(String[] args) {
		A a1 = new A();
		
		A a2 = a1; //객체 참조(객체에 이름이 2개)
		
		a1.a += 10;
		System.out.println("a2.a = "+a2.a);
		
		int a = 10;
		int b = a; //따로 존재하지만 값만 같다.
		
		a=20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		
	}
}
