package ch04;

public class StringConcatTest {
	public static void main(String[] args) {
		
		//람다식
		String s1 = "혜린아..";
		String s2 = "졸지마";
		
		StringConcat concat = (s,v)->System.out.println(s+v);
		concat.makeString(s1, s2);
		//
		
		//객체지향
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString("혜린아..","졸지마");
		//
		
		StringConcat concat2 = new StringConcat() { //new S 부분에서 ctrl+space -> 아래 함수 생김
			
			@Override
			public void makeString(String s1, String s2) { //실제로 람다식 내부에 이런 익명 함수가 쓰여지는 것이다!
				System.out.println(s1+"...."+s2);
			}
		};
		concat2.makeString(s1, s2);
		}
	}

