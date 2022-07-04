package ex0704;

public class ex02 {

	public static int bal = 0; //클래스 전체에서 사용가능
	
	public static void doA() {
		bal = bal + 100;
		System.out.println("doA "+bal);
	}
	public static void doB() {
		bal = bal + 200;
		System.out.println("doB "+bal);
	}
	public static void doC() {
		bal = bal + 300;
		System.out.println("doC "+bal);
	}
	
	public static void main(String[] args) {
		doA();
		doB();
		doC();
		System.out.println("bal = "+ bal);
	}
	
}
