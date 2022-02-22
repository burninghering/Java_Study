package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet; //<>안에 실제로 관리할 것을 넣으면 됨
	
	public MemberTreeSet() {
		treeSet=new TreeSet<Member>(new Member()); //Comparator가 구현된 것을 괄호 안에 지정해줘야 한다.
	}
	
	public MemberTreeSet(int size) {
		treeSet=new TreeSet<>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		for(int i=0; i<arrayList.size();i++) {
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			if (tempId==memberId) {
//				arrayList.remove(i);
//				return true;
//			}	
//		}
		
		Iterator<Member> ir = treeSet.iterator(); //<>에 아무것도 안쓰면 Object가 된다!
		//내가 이터레이션할 요소가 Member이기 때문에 <>안에 넣는다
		
		while(ir.hasNext()) { //ir에 다음이 있는가?
			
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if (tempId==memberId) {
				treeSet.remove(member); //i를 삭제하면 안되고 오브젝트를 삭제해야 한다.
				return true;
			}
		}
			System.out.println(memberId+"가 존재하지 않습니다.");
			return false;
		}
	
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
