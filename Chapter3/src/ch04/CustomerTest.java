package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(1000,"이순신");
		customerLee.bonusPoint=1000;
		int price=customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		
		VIPcustomer customerkim = new VIPcustomer(10020,"김유신");
		customerkim.bonusPoint=10000;
		price=customerkim.calcPrice(1000);
		System.out.println(customerkim.showCustomerInfo()+price);
		
		Customer vc = new VIPcustomer(12345,"noname");
		vc.calcPrice(1000);
		System.out.println(vc.calcPrice(1000));
	}
}
