package ch06;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee=new Student(); //디폴트 생성자
		//클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어 주는데
		//우리가 생성자를 만들어버렸다.
		
		System.out.println(studentLee.showStudentInfo());
	
		Student studentKim=new Student(123456,"Kim",3);
		System.out.println(studentKim.showStudentInfo());
	}
}

