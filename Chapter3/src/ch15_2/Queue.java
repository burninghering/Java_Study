package ch15_2;

public interface Queue {
	
	void enQueue(String title); //책 넣기
	String deQueue(); //책 꺼내서 책 이름 반환
	
	int getSize();
}
