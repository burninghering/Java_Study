package ch18;

public class Company {
	
	private static Company instance = new Company(); //유일한 인스턴스!
	
	private Company() {
		
	}
	
	//유일한 객체를 외부에서 쓸 수 있도록 하는 메소드
	public static Company getInstance() { //생성자를 안만들어도 쓸 수 있게 static 추가->클래스 이름으로 메소드 사용 
		if (instance==null) { 
			instance=new Company();
		}
		return instance;
	}
}
