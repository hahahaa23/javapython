package ex0705;

public class Triangle {

	int base;
	int height;
	
// alt + shift + s -> o 생성자 
// alt + shift + s -> r getter setter 만들기
	
	public Triangle() {}
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public void printTriangle() {
		System.out.println("넓이 = "+(base*height/2));
	}

}
