package ch14;

public interface Calc {
	double PI=3.14;
	int ERROR=-999999999;
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	default void description() { //디폴트 메서드
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod(); //아래 선언한 default 메소드 불러오기 가능
	}
	
	static int total(int[] arr) { //정적 메서드
		int total=0;
		for (int num:arr) {
			total+=num;
		}
		myStaticMethod(); //아래 선언한 static 메소드 불러오기 가능
		return total;
	}
	
	private void myMethod() {
		System.out.println("My method");
	}
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
