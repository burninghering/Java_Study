package ch15_2;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf; //하위 클래스가 상속 받아 쓸 수 있도록 protected로 선언
	
	public Shelf() {
		shelf = new ArrayList<String>(); //생성자가 호출될 때 멤버 변수를 초기화하는 것이 좋다.
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
