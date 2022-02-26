package ch02;

public class AddTest {

	public static void main(String[] args) {
		Add addL = ( x, y )-> {return x+y;}; //인터페이스의 무슨 함수를 사용했는지 모호해진다.
		Add addM= ( x,y )-> x+y;
		
		System.out.println(addL.add(2, 3));
		System.out.println(addM.add(2, 3));
	}
}
