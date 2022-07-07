package ex0705;

class Trianglee {
	
	int width;
	int height;	
	
	public Trianglee() {}
	public Trianglee(int width, int height) {
		super();
		this.width = width;
		this.height = height;
}

	public void printArea() {
		double area = this.width * this.height *0.5d;
		System.out.println("넓이 = "+area);
	}
	public void setwidth(int w) {
		width = w; //this.는 생략가능
	}
	public void setheight(int height) {
		this.height = height;
	}
}

public class Triangle_Tver {
	public static void main(String[] args) {
		Trianglee t1 = new Trianglee();
		t1.printArea();
		t1.setheight(50);
		t1.setwidth(50);
		t1.printArea();
		
		Trianglee t2 = new Trianglee(30,50);
		t2.printArea();
	}
}
