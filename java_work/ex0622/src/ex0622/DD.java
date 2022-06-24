package ex0622;

public class DD {
	
	public static void main(String[] args) {
		
		final int AA = 10;
		final String CC = "문자열";
		
		System.out.println("AA = "+ AA);
		System.out.println("CC = "+ CC);
		
		System.out.println("안녕하세요\n"); //줄바꿈
		System.out.println("안녕하세요\t박명회입니다."); //띄어쓰기
		System.out.println("\"안녕하세요\""); //""(쌍따옴표)출력
 		System.out.println("\'안녕하세요\'"); //''(홀따옴표)출력
		System.out.println("\\안녕하세요\\"); //\\(역슬러시)출력
		
		//final 은 값을 한 번만 가능
		//예) AA = 20
		/*
		 * 한번만..
		 * git init 현재 폴더를 git으로 초기화하겠다.
		 * git config email.name
		 * git remote add 주소
		 * 
		 * 할때마다..
		 * git add . 현재 폴더에 있는 파일을 올릴거다
		 * git commit -m"20" 메시지를 남기고 승인
		 * git push origin main 서버로 업로드
		 */
		
	}

}
