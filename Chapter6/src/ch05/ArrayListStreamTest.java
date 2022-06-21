package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>(); //ArrayList(구현 클래스)는 List(추상 클래스)의 하위 클래스이다
		
		sList.add("김");
		sList.add("이");
		sList.add("박");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.print(s+"\t")); //람다식 안에는 익명클래스가 구현되어 있다
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n+"\t")); //객체 자체에 대한 (객체가 가지고 있는) 오퍼레이션 하고싶으면 map!
		System.out.println();
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
		//지금 너가 가지고있는 스트림리스트에서 문자열이 5보다 크거나 같은 것을 찍어봐라!
	}

}
