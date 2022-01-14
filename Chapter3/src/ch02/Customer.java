package ch02;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; //같은 패키지 내에서만 사용 가능 
	double bonusRatio;
	
	public Customer() { //VIP손님 클래스 구현하기에는 생성자 따로 구현해야 하는 문제 발생
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int price) { //VIP 손님의 할인율을 위해 if문 사용해야하는 문제 발생
		bonusPoint+=price*bonusRatio;
		return price; //얼마가 할인됐는지 반환
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+" 이며, 보너스 포인트는 "+bonusPoint+"입니다";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
