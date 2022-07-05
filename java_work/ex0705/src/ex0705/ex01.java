package ex0705;

public class ex01 {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("a1.a = "+a1.a);
		a1.a +=10; //a1.a가 20으로 바뀜
		a1.doA();		
		a1.doB();		
		System.out.println(a1.doC(2.1));
		
		A a2 = new A(); //a1과는 다른 새로운 객체 생성
	}
}
