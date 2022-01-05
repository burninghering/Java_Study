package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		int num = 10;
		int bNum = 0B1010; /* (0B로 시작하면 뒤 숫자는 2진수(Binary)이다) */
		int oNum = 012; /* (0으로 시작하면 뒤 숫자는 8진수다) */
		int xNum = 0XA; /* (0X으로 시작하면 뒤 숫자는 16진수다) */
		
	
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}
