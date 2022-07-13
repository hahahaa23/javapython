package ex0713;

class Man{
	private String name;
	
//	public Man() {}
	
// alt shist s -> o
	public Man(String name) {
		super();
		this.name = name;
	}
	
//alt shift s -> s
	@Override
	public String toString() {
		return "Man [name=" + name + "]";
	}
}
//1. 부모클래스에 기본생성자 선언
//2. 자식 클래스에서 부모 생성자랑 동일한 생성자 선언
//즉 부모와 자식 클래스는 동일한 생성자를 가져야함.
	
public class BizMan extends Man{

	public BizMan(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		BizMan biz = new BizMan("홍길동");
		System.out.println(biz);
	}
}
