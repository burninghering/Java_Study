package ch4;

public class Person {
	private String name;
	private int age;
	
	public Person() {} //기본 생성자
	
	public Person(String name, int age) { //생성자
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() { //toString을 오버라이딩한다. 
		return name; //이름을 리턴한다. 
	}
	
	
	
}
