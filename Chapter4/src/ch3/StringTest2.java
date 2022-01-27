package ch3;

public class StringTest2 {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //그냥 sysout(java) 출력하면 hashcode 오버라이딩 된 값 나옴
		
		java = java.concat(android); //java에 assign을 했다(배정, 연결을 했다)
		
		System.out.println(java); //javaandroind에 연결이 됐다.
		System.out.println(System.identityHashCode(java));
		
	}
}