package ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=2;
		Calc calc = new CompleteCalc(); //Calc 인터페이스 타입을 가진 CompleteCalc의 인스턴스
		//타입이 Calc이기 때문에 clac 객체는 Calc 안의 변수만 사용 가능 
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		CompleteCalc calc2 = new CompleteCalc();
		calc2.showInfo();
	}
}
