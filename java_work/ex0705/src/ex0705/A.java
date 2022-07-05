package ex0705;

public class A {

	//alt + shift + s = 생성자 자동만들기
	public	int a = 10;
//	public A() {}
//	public A(int a) {
//		super();
//		this.a = a;
//	}
	public void doA() { /*void는 반환되는 값 ㄴㄴ*/
		System.out.println("doA a = "+a);	
	}
	public int doB() {
		System.out.println("doB a = "+a);
		return 10;
	}
	public double doC(double c) {
		System.out.println("doC");
		return c*c;
	}
}
