package ch03;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;  
	double bonusRatio;
	
	// 디폴트 생성자 없애고 매개 변수가 있는 생성자 추가
	public Customer(int customerID, String customerName) {
			this.customerID = customerID;
			this.customerName = customerName;
			
			customerGrade = "SILVER";
			bonusRatio = 0.01;
			System.out.println("Customer(int, String) 생성자 호출");
	}

	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+" 이며, 보너스 포인트는 "+bonusPoint+"입니다";
	}	
}
