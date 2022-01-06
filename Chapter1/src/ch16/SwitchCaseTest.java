package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
		case 1,3,5,7,8,10,12->
			31;
		case 4,6,9,11->
			30;
		case 2->
			28;

		default->{ //안에 문장이 두 개 이상 들어갈 때는, 중괄호 사용
			System.out.println("존재하지 않는 달입니다.");
			yield -1;
			}
		}; //day가 문장이므로 세미콜론으로 끝내야 함 !!! 중요		
		System.out.println(month+"월은 "+day+"일입니다.");
	}
}
