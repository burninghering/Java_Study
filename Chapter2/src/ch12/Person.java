package ch12;

public class Person {
	
	String name;
	
	int age;
	
	public Person() {//디폴트 생성자
		this("no name",1);
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void showPerson() {
		System.out.println(name+","+age);
	}
	
	public Person getPerson() {
		return this;
	}
	public static void main(String[] args) {
		Person person = new Person(); //디폴트 생성자 부른 것임
		person.showPerson();
		
		System.out.println(person); 

		Person person2 = person.getPerson(); //getPerson() 메서드의 반환 인자가 Person이기 때문에 Person person2로 값 받음
		System.out.println(person2);
		
		//person과 person2의 값이 같다 
	}
}