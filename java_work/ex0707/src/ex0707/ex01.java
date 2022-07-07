package ex0707;

public class ex01 {

	public static void main(String[] args) {
		Person p1 = new Person(); //객체 생성
		//p1.name = "자바";
		p1.setName("자바");
		System.out.println(p1);
		//ex0707.Person@27a5f880 -> 주소값
		System.out.println(p1.toString());
		//toString()생략가능 System.out.println(p1); = System.out.println(p1.toString());
		
		Person p2 = new Person("한글");
		System.out.println(p2);
		
	}
}
