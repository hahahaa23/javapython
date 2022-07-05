package ex0705;

public class Bankaccount {

	String jumin;
	String acc;
	int bal;
	int value;
	
	public Bankaccount() {}
	
	public Bankaccount(String jumin, String acc, int bal, int value) {
		super();
		this.jumin = jumin;
		this.acc = acc;
		this.bal = bal;
		this.value = value;
	}

	public Bankaccount(String jumin, String acc, int bal) {
		super();
		this.jumin = jumin;
		this.acc = acc;
		this.bal = bal;
	}

	//class를 만들면 기본생성자는 생략되어있다.
	//다른 생성자를 선언하면 기본생성자(public Bankaccount() {}) 생략불가
	public void deposit(int b) {
		bal = bal + b;
	}
	public void printbal() {
		System.out.println("주민번호 = "+jumin);
		System.out.println("계좌번호 = "+acc);
		System.out.println("bal = "+bal);
	}
}
