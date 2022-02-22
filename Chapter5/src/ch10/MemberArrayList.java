package ch10;

import java.util.HashSet;
import java.util.Iterator;

public class MemberArrayList {
	private HashSet<Member> hashSet; //이젠 HashSet을 쓸거야
	
	public MemberArrayList() {
		hashSet=new HashSet<>();
	}
	
	public MemberArrayList(int size) {
		hashSet=new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
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
		
		Iterator<Member> ir = hashSet.iterator(); //<>에 아무것도 안쓰면 Object가 된다!
		//내가 이터레이션할 요소가 Member이기 때문에 <>안에 넣는다
		
		while(ir.hasNext()) { //ir에 다음이 있는가?
			
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if (tempId==memberId) {
				hashSet.remove(member); //i를 삭제하면 안되고 오브젝트를 삭제해야 한다.
				return true;
			}
		}
			System.out.println(memberId+"가 존재하지 않습니다.");
			return false;
		}
	
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
