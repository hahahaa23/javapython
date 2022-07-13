package ex0713;

class Car {
	int gasolineGauge;

	@Override
	public String toString() {
		return "Car [gasolineGauge=" + gasolineGauge + "]";
	}

	public Car(int gasolineGauge) {
		super();
		this.gasolineGauge = gasolineGauge;
	}

}

class HybridCar extends Car {
	int electricGauge;

	@Override
	public String toString() {
		return "HybridCar [electricGauge=" + electricGauge + "]";
	}

	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}

}

class HybridWaterCar extends HybridCar {
	/*public HybridWaterCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge, electricGauge);
	}*/

	int waterGauge;

	public HybridWaterCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge, electricGauge);
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터양: " + waterGauge);
	}
}

public class test1411 {

	public static void main(String[] args) {
		new HybridWaterCar(10,20);
	}
}
