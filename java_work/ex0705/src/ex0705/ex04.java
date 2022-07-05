package ex0705;

class AA{
	int a = 10;
}

public class ex04 { //public으로 선언된건 맞춰주기.
	public static void setAA(AA a)  {
	a.a = 100;
	System.out.println("a.a = "+a.a);
}
	public static void main(String[] args) {
		AA aa = new AA();
		setAA(aa); //이름이 a와 aa인거
		System.out.println("aa.a = "+aa.a);
		setAA(new AA());
		
		AA a1 = null;
		if(a1 == null) {
			System.out.println("a1은 null입니다.");
		}
	}
}