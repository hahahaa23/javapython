package ex0715;

public class UniFriend extends Friend{
//extends Object는 생략가능

	private String major;

	public UniFriend(String name, String major, String phone) {
		super(name,phone);
		this.major = major;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 = "+major);
		
	}
}
