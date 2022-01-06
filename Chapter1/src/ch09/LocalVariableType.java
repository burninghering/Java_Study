 package ch09;

public class LocalVariableType {

	public static void main(String[] args) { // (String[] args) -> main 함수의 매개변수(파라미터)
		
		//지역변수란?
		//파라미터로 쓰이는 변수/중괄호 안에 있는 변수/함수 안에 있는 변수(그 지역 안에서만 쓰인다)
		
		//너무 뻔히 보이는,추론 가능한 자료형은 var로 타입을 기입
		var i = 10; //int
		var j = 10.0; //double
		var str = "hello"; //string
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; 
		//str = 3; 이미 string으로 선언되었기 때문에 int로 바꿀 수 없음
	}
}
