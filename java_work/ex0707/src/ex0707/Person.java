package ex0707;

public class Person {

	private String name;
	
	
// alt shift s -> r setter getter
// alt shift s -> o constructor
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
// alt shift s -> r setter getter
	}
	public String toString() { 
		return "Person name = "+name; 
//toString을 정의할 때 "Person"이 반환된다.
	}
	public Person() {} //다른생성자 만들면 기본 생성자 생략 불가
	public Person(String name) {
		super(); //생략가능
		this.name = name; 
//this.도 생략가능, 동일한 변수명이 같은 지역에 존재할 때 생략 불가.
// alt shift s -> o constructor
}
}
