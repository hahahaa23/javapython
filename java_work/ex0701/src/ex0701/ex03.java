package ex0701;
//값을 반환
public class ex03 {
	
	public static void main(String[] args) {
		doA();
		int result = doB();
		System.out.println("result = "+result);
		double dd = doC();
		System.out.println("dd = "+dd);
		String ee = doD();
		System.out.println("ee = "+ee);
	}
	
	public static void doA() { //void(비어있는), 리턴값ㄴㄴ
		System.out.println("doA");
		return; //값의 반환없이 매소드만 종료
		
	}
	public static int doB() {
		System.out.println("doB");
		return 10;
	}
	
	public static double doC() { //double은 소수점ㅇㅇ
		return 10.5;
	}
	public static String doD() { //String은 문자
		return "doD";
	}
}

/*
 * 매개변수가 있는 함수   ex (int a)
 * 
 * 
 * 매개변수가 없는 함수  ex ()
 */






