package ex0708;

public class test1011 {
	
	public static void main(String[] args) {
		System.out.println(Accumulator.MAX);
		Accumulator acc = new Accumulator();
		for(int i = 0; i < 10; i++)
			acc.add(i);
		acc.showResult();
	}
	
}
