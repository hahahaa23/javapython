package ex0705;

public class ex06 {

	public static void main(String[] args) {
		Bankaccount a1 = new Bankaccount("850511", "1234-1234", 1000);
		a1.deposit(2000);
		a1.printbal();
		
		Bankaccount a2 = new Bankaccount();
		//새로 만들고 싶을땐 new붙여서 생성하기.
	}
}
