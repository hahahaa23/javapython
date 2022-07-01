package ex0630;

public class ex02 {
	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
		//i는 0부터 10보다 작은 동안 1씩 증가
			if(i==5) { //=을 두개 쓰면 비교임
				break;
			}//for구문을 빠져나감, 한 줄 일때는 생략가능
			if(i==1)
				continue; //다음줄 실행 ㄴㄴ 위로 올라감, while 구문 탈출
			System.out.println("i = "+i);
		}
	
}
}
