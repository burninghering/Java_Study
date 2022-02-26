package ch05;

import java.util.ArrayList;
import java.util.List; //리스트 인터페이스가 콜렉션의 하위 인터페이스이기 때문에, 스트림을 호출 가능
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.print(s+"\t"));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n+"\t")); //객체 자체에 대한 (객체가 가지고 있는) 오퍼레이션 하고싶으면 map!
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
		//지금 너가 가지고있는 스트림리스트에서 문자열이 5보다 크거나 같은 것을 찍어봐라!
	} 
}
