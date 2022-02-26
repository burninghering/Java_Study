package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
	
		Arrays.stream(arr).forEach(n->System.out.println(n));

		IntStream is = Arrays.stream(arr); //스트림 사용 
		is.forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum(); //또다른 스트림을 사용하려면 하나 더 생성
		System.out.println(sum);
	}
}
