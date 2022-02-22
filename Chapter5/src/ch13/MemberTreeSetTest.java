package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{ //String에는 Comparable이 구현되어 있으니깐!

	@Override
	public int compare(String s1, String s2) { 
		return s1.compareTo(s2);
//		return s1.compareTo(s2) * (-1) ; //내림차순 
	}
}

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare()); //무엇으로 비교할 것인가? -> new MyCompare()
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
	
	}
}
