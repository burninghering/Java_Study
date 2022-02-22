package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer,Member> hashMap; //keyset으로 부르면 int반환, values로 부르면 Member들이 반환
	
	public MemberHashMap() {
		hashMap=new HashMap<>();
	}
	
	public void addMember(Member member) { //충돌을 완화하기 위해 로드밸런서가 어느정도 해쉬맵이 차면 뻥튀기를 시킨다
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		System.out.println("no elements");
		return false;
	}	
	
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator(); //Iterator를 직접 사용할 순 없고, keySet 키값을 set으로 불러와 사용
		//keySet()이 아니라 values를 사용하면 
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hashMap.get(key); //value가 쭉 꺼내지게 됨
			System.out.println(member);
			
		}
	}
}
