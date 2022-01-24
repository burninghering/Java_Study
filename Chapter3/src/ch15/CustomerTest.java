package ch15;

public class CustomerTest {
	public void main(String[] args) {
		Customer customer = new Customer();
		customer .buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; //업캐스팅->상위 클래스로 묵시적으로 형변환
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
	}
}
