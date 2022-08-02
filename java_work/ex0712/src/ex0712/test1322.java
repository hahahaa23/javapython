package ex0712;

public class test1322 {
		
	public static void main(String[] args) {
		int a[][] = { {1,2,3},{4,5,6},{7,8,9} };
		int b[] = a[0];
		int c[] = a[1];
		
		a[0] = a[2];
		a[1] = b;
		a[2] = c;
		
		test1321.printtwoArr(a);
	}
}
