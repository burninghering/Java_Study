package ch02;

public class AddTest {

	public static void main(String[] args) {
		Add addL = ( x, y )-> {return x+y;}; //Add가 구현되었다!
		Add addM= ( x,y )-> x+y;
		
		System.out.println(addL.add(2, 3));
		System.out.println(addM.add(2, 3));
	}

}
