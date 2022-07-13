package ex0713;

class AAA{
	int a;
	public AAA(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "AAA [a=" + a + "]";
	}
}
/*
 * 부모와 자식클래스에서 동일한 생성자가 선언되어야 하나->
 * 부모생성자를 임의적으로 지정시 문제없이 동작함.->super(a);
 */
class BBB extends AAA{
	private int b;
	private int c;
	public BBB(int a, int b, int c) {
		super(a);
		this.b = b;
		this.c = c;
	}
	@Override
	public String toString() {
		return "BBB [a="+super.a+", b="+b+",c=" + c + "]";
	}	
}

public class Ex05 {

	public static void main(String[] args) {
		//BBB bb = new BBB(1,2,3); 를 넣어도 출력가능
		System.out.println(new BBB(1, 2, 3));
	}
}
