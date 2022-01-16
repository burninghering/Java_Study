package ch06;

public class VIPcustomer extends Customer {

		double salesRatio;
		String agentID;

		// super를 이용하여 상위 클래스의 생성자 명시적으로 호출
		public VIPcustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

		@Override //컴파일러에게, 이녀석은 오버라이드 된 메소드라고 알려주는 것!
		public int calcPrice(int price) {
			bonusPoint+=price*bonusRatio;
			price-=(int)(price*salesRatio);
			return price;
		}	
}
