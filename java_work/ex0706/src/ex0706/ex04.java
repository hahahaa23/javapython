package ex0706;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력받을때 사용하는 class
		car c1 = new car();
		while(true) {
			System.out.println("1. 속도입력");
			System.out.println("2. 속도출력");
			int select = scanner.nextInt();
			if(select == 1) {
				System.out.println("속도 입력?:");
				int speed = scanner.nextInt();
				c1.setSpeed(speed); //속도입력받는거 ㅇㅇ
			}else {
				int speed = c1.getSpeed();
				System.out.println("현재 속도는 "+speed);
			}
				
	}
//파이썬에서는 get, set안써도 됨 
}
}
