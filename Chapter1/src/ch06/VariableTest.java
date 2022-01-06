package ch06;

public class VariableTest {

	public static void main(String[] args) {
		byte bnum=-128;
		
		System.out.println(bnum);
		
		int num = 12345678900; //너무 크니까 줄여라!
		long lnum = 12345678900; //리터럴이 너무 크니까 줄여라!
		long lnumber = 12345678900L; //잘했다
		
		long okay_num = 12345678; //long 범위 안에 맞는 리터럴을 넣으면 에러 X(알아서 int,4byte로 변환되기 때문)
	}
}
