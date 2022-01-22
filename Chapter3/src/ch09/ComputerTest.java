package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		Computer desktop = new Desktop(); //상위 클래스 타입으로 선언(상속과 똑같으며 업캐스팅)
		//상위 클래스로 타입을 정했으니, 하위 클래스 Desktop에 새로 구현된 클래스는 쓸 수 없다.
		
//		Computer computer=new Computer(); //안돼!
		
		desktop.display();
	}
}
