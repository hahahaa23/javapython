package ex0708;

class Accumulator{
	public int i;
	
	Accumulator.showResult():
		public Accumulator(int i) {
		this.i = i;
		System.out.println("");
		
		
	Accumulator.add(i):
		if i < 10{
			i = i + i++
		}
	
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}
	
public class test1011 {


	}
}
