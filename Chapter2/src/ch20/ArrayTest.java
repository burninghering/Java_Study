package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int total=0;
		
		for(int i=0, num=1; i<arr.length; i++) { //1. 1~10까지 배열에 넣기
			arr[i]=num++;
		}
		
		int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10}; //2.처음부터 1~10 넣어서 배열 초기화
		
		for(int num : arr) { //3. 배열의 모든 요소를 순회할 때
			total+=num;
		}
		System.out.println(total);
		}
	}

