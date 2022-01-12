package ch24;

import java.util.ArrayList;

public class Student {
	
	 String studentName;
	 int studentID;
	ArrayList <Subject> subjectlist; //참조 자료형 변수 대신 ArrayList에 과목들을 넣자
	//여기서 바로 new 해서 ArrayList를 만들 수 있지만, 인스턴스가 생길 때마다 배열을 만들자 
	
	
	public Student(int studentNumber,String studentName) {
		this.studentID=studentNumber;
		this.studentName=studentName;
	
		subjectlist=new ArrayList<Subject>();
	}
	
	public void addSubject(String name,int score) { //학생마다 자기가 수강한 과목 수대로 메소드가 불릴 것이며, 배열도 그만큼 늘어날 것이다.
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		subjectlist.add(subject);
	}
	
	public void showStudentInfo() {
		int total=0;
		
		for (Subject s : subjectlist) { //subjectlist가 가지고 있는 자료형이 Subject이고, 하나씩 s로 꺼낼 것이다 
			total+=s.getScore();
			System.out.println("학생"+studentName+"의"+s.getName()+"과목 성적은 "+s.getScore()+"입니다.");
		}
		
		System.out.println("학생"+studentName+"의 총점은"+total+"입니다.");
	}
}
