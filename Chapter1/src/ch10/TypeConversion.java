package ch10;

public class TypeConversion {

	public static void main(String[] args) {

		int iNum=255;
		byte bNum=(byte)iNum;
		
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum; //cast를 사용해 소수점 이하를 없애버림
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
