package ch21;

public class BreakTest {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		
		for( num = 1; ; num++) {
			sum += num;
			if( sum >= 100)	break; //자기를 감싼 반복문(for)만 빠져나옴!
		}
		
		System.out.println(sum);
		System.out.println(num);
	}
}
