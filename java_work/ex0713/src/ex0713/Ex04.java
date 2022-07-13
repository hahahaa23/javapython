package ex0713;

class AA{
	AA(){
		System.out.println("AA 기본생성자");
	}
}

class BB extends AA{
	BB(){
		super(); //생략가능, 부모클래스에 있는 기본생성자 호출
		System.out.println("BB 기본생성자");
	}
}


public class Ex04 {

	public static void main(String[] args) {
		new BB();
	}
}
