package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList();
		
		Customer customerT = new Customer(10010,"Tomas");
		Customer customerJ = new Customer(10020,"James");
		Customer customerE = new GoldCustomer(10030,"Edward");
		Customer customerP = new GoldCustomer(10040,"Percy");
		Customer customerK = new VIPcustomer(10050,"Kim");
		
		customerList.add(customerT); //ArrayList에는 순서대로 들어가니까..
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
//		for(Customer customer:customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price=10000;
//		for(Customer customer:customerList) {
//			
//			
//			int cost=customer.calcPrice(price); //리스트의 한 고객씩 꺼내지며 계산이 된다
//			System.out.println(customer.getCustomerName()+"님이  "+cost+"원 지불하셨습니다.");
//			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+" 입니다.");
//		}
		
//		VIPcustomer vc=customcerE; //customcerE는 현재 Customer 타입이라 에러 발생
		
//		if(customerE instanceof VIPcustomer) { //customerE가 VIPcustomer의 인스턴스인지
//			VIPcustomer vc=(VIPcustomer)customerE; 
//		}
//		
		if(customerE instanceof GoldCustomer) { //customerE가 GoldCustomer의 인스턴스인지
			GoldCustomer vc=(GoldCustomer)customerE; 
			System.out.println(customerE.showCustomerInfo());
		}
	}
}
