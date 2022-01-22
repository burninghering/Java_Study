package ch09;

public class Desktop extends Computer { // Computer를 상속받게 되면, 두개의 추상 메소드를 포함하게 됨

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	void turnOff() {
		System.out.println("Desktop turnoff");
	}
}
