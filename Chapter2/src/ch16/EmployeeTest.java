package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee =new Employee(); //(생성자를 안만들어줬지만 기본생성자가 있으니까) new해서 인스턴스 만들기!
		employeeLee.setEmployeeName("이순신");
		
		Employee employeeKim =new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());
	}
}
