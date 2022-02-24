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
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스(멤버) 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스(멤버) 변수)");
		}
	}
	
	 void usingClass() {
		inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출
	}
	 
	 static class InStaticClass {
		 int iNum=100;
		 static int sInNum=200;
		 
		 void inTest() { 
//				System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스(멤버) 변수)") ;//외부 클래스의 멤버 변수 num이 아직 안만들어졌는데 호출될수도 있어서 에러남
				System.out.println("InClass num = " +iNum + "(본인(정적), 즉 내부 클래스의 인스턴스(멤버) 변수)");
				System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
				System.out.println("InClass inNum = " + sInNum + "(본인(정적), 즉 내부 클래스의 static  인스턴스(멤버) 변수)");
				
				System.out.println("결론적으로 외부클래스의 인스턴스 변수는 사용할 수 없다. 생성이 안되어있을 수도 있으니까");
			}
		 
		 static void sTest() { //static 클래스의 static 메소드는 static 클래스가 생성되지 않아도 static 메소드가 호출 될 수 있다
//				System.out.println("InClass num = " +iNum + "(본인(정적), 즉 내부 클래스의 인스턴스(멤버) 변수)"); //그래서 에러남
				System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
				System.out.println("InStaticClass sInNum = " + sInNum + "(본인(정적), 즉 내부 클래스의 static  인스턴스(멤버) 변수)"); //그래서 에러남
		 }
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
	
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //외부 클래스에서 정적 클래스는 바로 생성 가능
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest(); //정적 메소드는 바로 호출 가능하며, 스태틱 변수만 사용 가능
	}

}
