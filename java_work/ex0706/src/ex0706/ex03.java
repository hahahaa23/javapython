package ex0706;

class Circle{
	private int rad;// (private)같은 class 내에서는 사용가능, 다른 class는 사용불가.
	final double PI = 3.14;
	public void printArea() {
		System.out.println("넓이 = "+PI*rad*rad);
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		if(rad<0) {
			System.out.println("반지름은 음수가 없습니다.");
			return; //종료
		}
		this.rad = rad;
	}
	public double getPI() {
		return PI;
	}
	// alt + shift + s -> r + alt a + alt r
}

public class ex03 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRad(10);
//c1.rad = 10;-> class Circle에서 private로 선언돼서 다른 클래스에서 변경 사용 불가.
		c1.printArea();
		
		
		
	}
}
