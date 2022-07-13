package ex0713;

class A{
	int a = 10;
	public void doA() {
		System.out.println("doA");
	}
	
}
class B extends A{
	public void doB() {
		super.doA(); //생략가능.
		System.out.println("doB a = "+super.a); 
		// super.대신 this.사용가능
	}
}

public class Ex01 {

	public static void main(String[] args) {
		B b = new B();
		b.doB();
	}
}
