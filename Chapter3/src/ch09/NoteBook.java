package ch09;

public abstract class NoteBook extends Computer {

	@Override
	public void display() { //추상 메서드 하나만 구현할거야.. 
		System.out.println("NoteBook display");
	}
}
