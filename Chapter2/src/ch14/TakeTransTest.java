package ch14;

public class TakeTransTest {
	public static void main(String[] args) {
		Student hyerin=new Student("혜린",5000);
		Student hyeongsoo=new Student("형수",10000);
		
		Bus bus100 = new Bus(100); //버스는 여러 대의 버스가 있을 수 있다.
		Bus bus500 = new Bus(500);
		
		hyerin.takeBus(bus100); //인스턴스로 넘어간 버스는 100번!
		
		SubWay greenSubway = new SubWay(2);
		hyeongsoo.takeSubway(greenSubway);
		
		hyerin.showInfo();
		hyeongsoo.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		
		bus500.showBusInfo();
	}
}
