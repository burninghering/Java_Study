package ch1;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}

	@Override
	public String toString() { //toString() 오버라이딩해서 재정의하기 
		
		return title+","+author;
	}	
}	

public class BookTest{
	public static void main(String[] args) {
		
		Book book=new Book("데미안","헤르만 헤세");
		
		System.out.println(book.toString());
		
		String str = new String("test"); //toString()을 이미 오버라이딩해서 쓰고 있음
		
		System.out.println(str); //toString()이 뒤에 제외됨
		}
	}	
