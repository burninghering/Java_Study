package ch09;

public class LocalVariableInter {
	
	public static void main(String[] args) {
		var i =10; //자바 환경 JavaSE-17, 10보다 이상이므로 사용 가능
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2=str;
		System.out.println(str2);
		
	}
}
