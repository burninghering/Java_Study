package ch4;

import java.lang.reflect.Constructor; //Constructor[]를 쓰기 위해 import
import java.lang.reflect.Method; //Method[] 

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors(); //c.getConstructors()가 Constructor array로 반환된다.
		
//		for(Constructor co:cons) { //c의 멤버 생성자들 보기
//			System.out.println(co);
//		}
		
		Method[] m = c.getMethods(); //c의 멤버 메서드들 보기
		for(Method mth : m) {
			System.out.println(mth);
		}
	}

}
