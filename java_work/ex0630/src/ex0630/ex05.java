package ex0630;

public class ex05 {

	public static void main(String[] args) {
		for(int i = 0; i<3; i++) {
			System.out.println("시작");
			int j = 0;
			for(; j<3; j++) {
				System.out.println("i = "+i+" j= "+j);
				
			}
			System.out.println(); //줄 바꿈
			for(int k = 0; k<3; k++) {
				System.out.println("j = "+j);
				System.out.println("i = "+i+" k = "+k);
			}
			System.out.println(); //줄 바꿈
		}
	}
}
