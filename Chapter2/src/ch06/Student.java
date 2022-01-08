package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;

	public Student() {
	}

	public Student(int studentNumber, String studentName, int grade) {

		// studentNumber=studentNumber;
		// 변수는 가장 가까운 변수를 찾기 때문에, 매개 변수에다가 매개 변수를 넣게 된다.
		// 우리는 멤버 변수에 넘어온 값을 대입하고 싶다 (=생성자의 역할)

		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}

	public String showStudentInfo() {
		return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년입니다.";
	}

}
