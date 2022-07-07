package ex0706;

import myclass.AAA; // 같은 패키지에 있을땐 안적어도 됨 
import myclass.ZZZ;

public class ex01 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.doA();
		
		ZZZ zzz = new ZZZ();
		zzz.doA();
	}
}
