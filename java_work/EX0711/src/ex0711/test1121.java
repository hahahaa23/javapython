package ex0711;

public class test1121 {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("990925-1012999");
		a.delete(6,7);
		a.replace(6,7," ");
		System.out.println(a.toString());

	}
}
