package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[ ] arr = {1,2,3,4,5};
		
		for (int num:arr) {
			System.out.println(num);
		}
		
		//위 코드를 stream으로 표현해보자
		
//		Arrays.stream(arr); //여기까지만 하면, int stream을 반환해준다
		Arrays.stream(arr).forEach(n->System.out.println(n)); //stream의 opreation중 하나인 forEach는 하나씩 꺼내는 것이며 ()안에 무엇을 할 것인지 써줌(람다식)
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		
		//stream을 다시 쓰려면(또 다른 연산을 하려면) 다시 생성하고 사용해야함
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}
