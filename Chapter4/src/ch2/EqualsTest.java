package ch2;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100,"Lee");
		Student std2=new Student(100,"Lee");
		
//		System.out.println(std1==std2); // 주소는 다르지만,
//		System.out.println(std1.equals(std2)); //논리적으로 같다는 것을 재정의했기 때문에 true 반환
//		
//		System.out.println(std1.hashCode()); //논리적으로 같기 때문에
//		System.out.println(std2.hashCode()); //같은 hashcode값 리턴
		
//		System.out.println(System.identityHashCode(std1)); //그렇다면 객체의 진짜 hashcode값을 알고 싶을때?
//		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone(); //인스턴스의 상태를 그대로 복제 가능
		System.out.println(copyStudent);
		
	}
}
