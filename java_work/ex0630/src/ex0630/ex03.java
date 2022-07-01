package ex0630;

public class ex03 {

	public static void main(String[] args) {
		
		int num = 1;
		boolean search = false;
		while(num<100) {
			if((num %5 == 0) && (num %7 ==0)) {
				search = true; //search를 true로 바꿔야함.
				break;
			}
			num++;
		}
		if(search)
		System.out.println("num = "+num);
	}
}
