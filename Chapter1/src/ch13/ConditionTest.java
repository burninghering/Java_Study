package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		int max;
		
		Scanner scanner = new Scanner(System.in); //(System.in) 은 표준 입력을 뜻함 / sout에서는 표준 출력!
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n");
		
		int num1 = scanner.nextInt(); //여기서 입력 받음
		int num2 = scanner.nextInt();
		
		max=num1>num2?num1:num2;
		System.out.println(max);
	}
}
