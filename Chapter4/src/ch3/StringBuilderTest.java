package ch3;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer)); //연결하기 전의 값
		
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));//연결 후의 값
		
		String test = buffer.toString();
		System.out.println(test);
		
	}
}
