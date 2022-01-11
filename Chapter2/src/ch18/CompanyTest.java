package ch18;

public class CompanyTest {
	public static void main(String[] args) {
		
		Company company1 = Company.getInstance(); //static 변수는 클래스로 불러올 수 있음
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
	}
}
