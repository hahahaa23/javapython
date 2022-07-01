package ex0630;

public class test0562 {
/*
 * 자연수 1부터 시작해서 모든 홀수를 더해 나간다. 
 * 그리고 그 합이 언제 1000을 넘어서는지 그리고 1000을 넘어선 값은 얼마가 되는가?
 */
	public static void main(String[] args) {
		
		int num = 1;
		//1,3,5,7,9
		int sum = 0;
		while(true) {
			sum += num; //sum + sum + num; 으로 적어도 됨
			num += 2; // num = num + 2;으로 적어도 됨
			System.out.println("num = "+num);
			if (sum > 1000)
				break;
	}
		System.out.println("sum = "+ sum);

	}
}