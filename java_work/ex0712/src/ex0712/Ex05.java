package ex0712;

public class Ex05 {

	public static void main(String[] args) {
		String ar[] = new String[3]; //칸을 만들어서 값은 null임
		System.out.println(ar[0]);
		
		ar[0] = "abc";
		ar[1] = "bcd";
		ar[2] = "test";
		//각 칸에 값을 넣어줌
		for (int i = 0; i<3; i++) {
			System.out.println(ar[i].length());
		}
//		System.out.println(ar[0].length());
//		System.out.println(ar[1].length());
//		System.out.println(ar[2].length());
		
		System.out.println("ar[0] = "+ar[0]);
		
		
	}
}
