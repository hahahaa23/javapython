package ex0707;

import zoo.Duck;
//ctrl shift o
public class ex02 {
	public static int a = 10;
	ex02(){
		zoo.Dog dog = new zoo.Dog();
		zoo.Cat cat = new zoo.Cat();
		Duck duck = new Duck();
		sound(dog, cat, duck);
	}
	public void sound(zoo.Dog dog, zoo.Cat cat,zoo.Duck duck) {
		dog.sound();
		cat.sound();
		duck.sound();
	}
	//여기까지가 캡슐화
	
	
	public static void main(String[] args) {
		new ex02();
	//static영역은 프로그램이 끝날 때 까지 상주해있음.많이 참조하는건 여기다 하자. (용량 많이 먹어서 느려짐)
	//heap영역은 있다 없다 하는거라 오히려 좋아(원활한 사용 가능)
	}
}
