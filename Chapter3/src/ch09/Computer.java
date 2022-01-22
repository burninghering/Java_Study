package ch09;

public abstract class Computer {
	public abstract void display(); //이 클래스에서 구현하지 못할 메서드는 추상 메서드로 놓고, 하위 클래스에 책임을 위임 
	public abstract void typing(); //나는 구현하지 않을 것이니 상속받을 너희가 구현해라!
	
	void turnOn() {
		System.out.println("전원을 켭니다."); //하위 클래스들이 공통으로 쓸 메소드는 구현해놓음
	}
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
