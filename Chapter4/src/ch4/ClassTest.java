package ch4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("ch4.Person"); //ch4 패키지 아래의 Person 클래스
		Person person=(Person)c1.newInstance(); //반환값이 오브젝트니까 (Person)으로 업캐스팅
		
		person.setName("Lee");
		System.out.println(person);
		
//여기서부터				
		Class c2 = person.getClass(); // getClass()를 쓰려면 인스턴스가 있어야 한다.(우리는 person이 있다)
		Person p=(Person)c2.newInstance(); //기본 생성자가 불려진다.
		System.out.println(p); //null 리턴
		

		Class[] parameterTypes = {String.class}; //2. Class array로, String.class를 주자
		Constructor cons=c2.getConstructor(parameterTypes); //1. getConstructor를 쓰려면 파라미터 타입이 무엇인지 정해 인자를 넣어줘야 한다.
		
		Object[] initargs= {"Kim"}; //2. Object array로 {"Kim"} 주기
		Person KimPerson = (Person)cons.newInstance(initargs); //1. newInstance를 쓰려면 초기값이 필요하다
		System.out.println(KimPerson);
//여기까지가 아래 코드와 같다.
		Person kim2=new Person("Kim");
	}
}
