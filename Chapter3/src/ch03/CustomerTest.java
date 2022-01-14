package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(1000,"이순신");
		customerLee.bonusPoint=1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPcustomer customerkim = new VIPcustomer(10020,"김유신");
		customerkim.bonusPoint=10000;
		
		System.out.println(customerkim.showCustomerInfo());
	}
}
