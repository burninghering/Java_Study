package ch13;

public class BitTest {

	public static void main(String[] args) {

		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2); //00001111 -> 15
		System.out.println(num1 & num2); //00000000 -> 0
		System.out.println(num1 ^ num2); //두 개의 비트가 다를 때, 00001111 -> 15
		System.out.println(~num1); //11111010 -> 음수가 됨 (보수를 취해서 -6 나옴)
		
		System.out.println(num1 << 2); //(00000101 << 2) -> 00010100 -> 20 
		//비트가 n 옮겨진 만큼, 2의 n승이 곱해짐 
		
		System.out.println(num1); //5
		
		System.out.println(num1 <<= 2); //20
		System.out.println(num1); //20
	}
}
