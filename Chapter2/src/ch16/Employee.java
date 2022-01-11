package ch16;

public class Employee {
	
	private static int serialNum=1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee(){
		serialNum++;
		employeeId=serialNum;
	}
	
public static int getSerialNum() { //static 메소드
		int i=0;
		employeeName="Lee";
		
		return serialNum;
	}

	//속성 변수를 private로 만들고, get/set으로 변수 오용되는 것 막기! 
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
