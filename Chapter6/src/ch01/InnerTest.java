package ch01;

class OutClass{
	private int num=10;
	private static int sNum=20; //static 변수는 instance 변수보다 먼저 생성됨
	private InClass inClass; //일단 변수로 만들고, 그것을 객체화하는 것이 new이다 
	
	public OutClass(){  //Out Class가 생성될 때
		inClass=new InClass(); //// 내부 클래스 inClass가 생성된다.
	}
	
	private class InClass{ //Instance Inner Class는 OuterClass가 먼저 생성된 뒤 생성됨
		int iNum=100;
		
//		static int sINum=500; //static을 사용하려면, 정적 내부 클래스에서 사용해야 한다.
		
	 void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	 void usingClass() {
		inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출
	}
}


public class InnerTest { //완전 완전 외부 클래스

	public static void main(String[] args) {
		OutClass outClass=new OutClass();
		outClass.usingClass();
		
		System.out.println();
		
//		OutClass.InClass inner = outClass.new InClass(); //OutClass의 InClass에 private를 없애고 굳이 이렇게 쓸 수는 있음
//		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
//		inner.inTest(); //private 안없애면 오류남
	}

}
