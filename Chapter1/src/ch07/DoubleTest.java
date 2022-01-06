package ch07;

public class DoubleTest {
	public static void main(String[] args) {
		
		double dnum=3.14;
		float fnum=3.14F; //리터럴은 지정된 데이터 타입(int)으로 저장 -> 4byte -> 3.14는 4byte에 담긴 너무 크다  -> f붙이기
		//만약 파라미터 에러가 날 때,  F를 안 붙여줘서 에러가 나는 경우가 많음 
		
		System.out.println(dnum);
		System.out.println(fnum);
	}

}
