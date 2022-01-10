package ch14;

public class Student {
	String studentName;
	int money;
	
	public Student(String studentName,int money) {
		this.studentName = studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) { //클래스 Bus, 어떤 버스를 탔는지 매개변수로 넘어옴
		bus.take(1000); //버스 객체에 의해 take 함수가 불려졌다.
		this.money-=1000;
	}
	
	public void takeSubway(SubWay subway) {
		subway.take(1200);
		this.money-=1200;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"원 입니다.");
	}
}
