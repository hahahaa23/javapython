package ex0713;

public class Ex02 {

	public static void main(String[] args) {
		int a [][] = new int[3][4];
		
		int num = 1;
		
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = num;
				num++;
			}
		}
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j <a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}//print는 줄바꿈이 없음. println은 줄바꿈 함.
			System.out.println();
		}
	}
}
