package ex0707;

class Point {
	int xPos, yPos;

	//생성자 자동 만들기 alt shift s -> o
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void showPointinfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}
}
public class Circle { //클래스 명이랑 같아야 됨.
	Point point;
	int r;
	public Circle(int i, int j, int k) {
		point = new Point(i,j);
		this.r = k;
	}
	private void showCircleInfo() {
		System.out.println("반지름 r = "+this.r);
		point.showPointinfo();
	}
	public static void main(String[] args) { //제일 처음 시작
		Circle circle = new Circle(2, 2, 4);
		circle.showCircleInfo(); //creat method를 이용해 만들기(빨간줄 위에 마우스 올리면 뜸)
	}
}
/*
 * 
 */