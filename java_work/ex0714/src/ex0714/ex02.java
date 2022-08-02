package ex0714;
class Super{
	
}
class Sub extends Super{
	
}
class AAA{}
public class ex02 {

	public static void main(String[] args) {
		Super super1 = new Sub();
		Sub sub = (Sub)super1;
	}
}
