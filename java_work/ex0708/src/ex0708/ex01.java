package ex0708;

class A{
	static int a = 0;
	A(){
		a++;
		System.out.println("a = "+a);	
		}
	}

public class ex01 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		
		System.out.println("a");
		System.out.println();
	}

	

}
