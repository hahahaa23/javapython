package ex0705;
/*
 * 문제1. 생성자를 포함하는 클래스의 정의
 * 밑변과 높이를 저장할 수 있는 Triangle 클래스를 정의하자.
 * (그 안에 적절한 생성자도 정하자.) 그리고 밑변과 높이 정보를
 * 변경할 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자.
 * 물론 이 클래스의 활용의 예를 보이는 main 메소드도 함께 작성해야한다.
 * ++ Triangle사용.
 */
public class test0711 {

	public static void main(String[] args) {
		Triangle a1 = new Triangle(2,3);
		a1.base=2; //=있는 수식은 괄호 안씀. 함수가 괄호 씀 ㅇㅇ
		a1.height=3;
		a1.printTriangle();
		
	}
}
