package ch14;

public class CompleteCalc extends Calculator { //Calculator를 상속받고, Calc 인터페이스의 타입이다. 

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2==0)
			return ERROR;
		
		return num1/num2;
	}

	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}

	@Override
	public void description() {
//		super.description(); //인터페이스에서 default로 선언되었기 때문에, super로 사용 가능
// 	    하지만 우리는 재정의 해보자
		System.out.println("CompleteCalc overriding");
	}	
}
