package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {} //구현부가 없을 뿐, 추상메서드가 아니기때문에 에러가 나지않음
	
	final public void run() { //추상메서드가 있건 없건, 시나리오를 세운다(변하면 절대 안됨)
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
