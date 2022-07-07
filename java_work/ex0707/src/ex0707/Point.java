package ex0707;

import ex0707.Circle; 

class Point {
	int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPointinfo() {
		System.out.println("[" + xPos + "," + yPos + "]");

	}

	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
	}
}