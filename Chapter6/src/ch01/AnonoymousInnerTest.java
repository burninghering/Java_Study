package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { //Runnable 인터페이스를 반환한다. 그래서 이 함수의 이름은 getRunnable
	//Runnable 인터페이스 클래스를 스레드화 할 때 run을 제공함
		
		int num=10;
		
		return new Runnable(){

		int localNum=1000;
		
		@Override
		public void run() {
			
			System.out.println("i =" + i); 
			System.out.println("num = " +num);  
			System.out.println("localNum = " +localNum);
				
			System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
			System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			
			}		
		};
	}
	
	Runnable runnable = new Runnable() { //Outer2클래스의 인스턴스 변수인 runnable

		@Override
		public void run() { //runnable 변수에 대한 run() 함수를 호출할 수 있다 
			System.out.println("Runnable class");
		}
	};
}

public class AnonoymousInnerTest {

	public static void main(String[] args) {
		  
		Outer2 out = new Outer2();
		out.runnable.run();
	}

}
