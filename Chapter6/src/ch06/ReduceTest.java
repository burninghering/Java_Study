package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceTest {

class CompareString implements BinaryOperator<String>{ //BinaryOperator를 구현한 클래스를 reduce() 괄호 안에 넣으면 된다

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length>=s2.getBytes().length) return s1;
		else return s2;	
	}
}
	
	public static void main(String[] args) {
		
		String greetings[ ] = {"안녕","hello","니 하오"};
		
		//람다식으로 직접 쓰기
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
				{if (s1.getBytes().length>=s2.getBytes().length) return s1;
				else return s2;}
					));
		
		//reduce 사용하기
		//String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		//System.out.println(str);
		
	}
}
