package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(final int i) { //Runnable 인터페이스를 반환한다. 그래서 이 함수의 이름은 getRunnable
	//Runnable 인터페이스 클래스를 스레드화 할 때 run을 제공함
		
		final int num=10;
		
		class MyRunnable implements Runnable{
	
		int localNum=1000;
			
		@Override
		public void run() { //run은 getRunnable()을 받고 나면 또 호출될 여지가 있음
			
//			i=50; //그때, 이러한 변수들이 없을 수도 있으니 여기서는 값을 변경할 수 없다(스택에 잡히면 안된다!)
//			num=20; //그러므로 애초에 final로 선언하고, 변수를 아래처럼  갖다 쓰기만 한다.(외부 지역 변수를 쓸 때 조심!)
			System.out.println("i =" + i); 
			System.out.println("num = " +num);  
			System.out.println("localNum = " +localNum);
				
			System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
			System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			
			}		
		}
		return new MyRunnable();
	}
}

public class AnonoymousInnerTest {

	public static void main(String[] args) {
		  Outer2 out = new Outer2();
		  Runnable runner = out.getRunnable(100); //getRunnable의 스택에 잡혔던 멤버변수들이 이 명령어가 끝난 뒤 사라짐
		  
		  runner.run(); //이렇게 다시 run()에서 멤버변수들이 불려져버리기 때문에, 상수화 해버린다.
	}

}
