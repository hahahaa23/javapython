package ex0622;

public class GG {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20; 
		int num3 = 30;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		
		System.out.println(num1 < num2 && num2 < num3); // &&는 '그리고'
		System.out.println(num1 > num2 && num2 < num3);
		//앞의 값이 참이면 뒷 계산도 하지만 앞이 거짓이면 뒷 연산 계산 ㄴㄴ
		
		System.out.println(!true); //참을 부정하면 거짓
		
		
		
	}
	
	
}
