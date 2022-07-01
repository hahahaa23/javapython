package ex0630;

/*
 * 두 개의 수를 선언하고
 * 두 수 중에 큰 수를 삼향 연산자 출력하고
 * 
 * 두 수의 차의 절댓값
 * ctrl + F11 --> 실행
 * ctrl + shift + f --> 자동정렬
 * shift + tab --> 들여쓰기
 */

public class CondOp {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		int result = 0;
		
		System.out.println("num1 "+ num1);
		System.out.println("num2 "+ num2);
		
		if(num1>num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		System.out.println("result = "+result);
		
	
		if(num1>num2) {
			result = num1-num2;
		}
		else {
			result = num2-num1;
		}
		System.out.println("result = "+result);
		
		
		
		
//		int result = num1>num2? num1:num2;
//		//오른쪽 항 먼저 계산하고 참이면 num1, 거짓이면 num2출력
//		System.out.println("result = "+result);
//		
//		result = num1>num2? num1-num2:num2-num1;
//		System.out.println("result = "+result);
//		
		
		
		
		
		
		
	}
	
	
}
