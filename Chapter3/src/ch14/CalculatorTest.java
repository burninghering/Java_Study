package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=2;
//		Calc calc = new CompleteCalc(); //Calc 인터페이스 타입을 가진 CompleteCalc의 인스턴스
//		//타입이 Calc이기 때문에 clac 객체는 Calc 안의 변수만 사용 가능 

		CompleteCalc calc=new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.description(); //인터페이스를 구현한 클래스의 인스턴스로 사용가능(defalut 메소드)
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr)); //객체 생성 없이, 인터페이스 이름으로 바로 호출(static 메소드) 
	}
}
