package ch03;

public class VIPcustomer extends Customer {

		double salesRatio;
		String agentID;

		// super를 이용하여 상위 클래스의 생성자 명시적으로 호출
		public VIPcustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
}
