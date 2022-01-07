package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// 학교라는 클래스에서, 한명 의 학생 생성(객체) -> 인스턴스

		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";

//		studentLee.showStudentInfo();

		Student studentKim = new Student();
		studentKim.studentName = "Kim";
		studentKim.address = "경기 성남구";

//		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	}
}
