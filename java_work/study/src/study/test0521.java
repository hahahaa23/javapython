package study;

public class test0521 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		if(num1>num2){
			System.out.println("큰 수: "+num1);
		}else {
			System.out.println("큰 수: "+num2);
		}
		
		if(num1>num2) {
			System.out.println("절댓값: "+(num1-num2));
		}else {
			System.out.println("절댓값: "+(num2-num1));
		}
	}
}