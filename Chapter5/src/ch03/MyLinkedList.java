package ch03;

public class MyLinkedList {

	private MyListNode head; //첫 번째 엘리먼트 
	int count; //개수
	
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public MyListNode addElement( String data ) //맨 끝에 노드 추가하기
	{
		MyListNode newNode;
		
		if(head==null) { //헤드가 null이라면 이 애가 첫 노드
			newNode=new MyListNode(data); //들어오는 데이터로 생성 해주면 된다
			head=newNode;
		}
		else {
			newNode=new MyListNode(data);
			MyListNode temp = head; //head부터 시작해서 돈다
			while(temp.next!=null) { //마지막일 때 까지
				temp=temp.next; //temp에 temp의 다음 노드를 가리키면 된다.
			}
			temp.next=newNode;
		}
		count++;
		
		return newNode;
	}
	
	
	//링크드리스트에서 중간에 요소를 추가/삭제하려면 추가/삭제하려는 위치 바로 이전 노드 위치를 알아야한다.
	
	public MyListNode insertElement(int position, String data ) //중간에 노드 추가하기
	{
		int i; //포지션 찾기 위한 변수
		MyListNode tempNode=head;
		MyListNode preNode = null; //초기화 안해주면 에러남
		
		MyListNode newNode=new MyListNode(data);
		
		if (position<0 || position>count) {
			return null;
		}
		
		if(position==0) { //맨 앞에 들어가려면
			newNode.next=head; //새로운 노드의 다음 노드가 head가 된다.
			head=newNode;
		}
		
		else { //중간에 넣으려면, position까지 돌면서 previous 노드를 찾아준다
			for(i=0; i<position; i++) { //position보다 하나 작은 i가 preNode가 될 것이며, tempNode가 preNode의 다음 노드가 됨
				preNode=tempNode; //일단 이전 노드에 head를 넣고
				tempNode=tempNode.next; //tempNode에 tempNode 다음 노드를 넣는다. 계속 찾아간다....
			}
			newNode.next=preNode.next;
			preNode.next=newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode=head;
		MyListNode preNode=null;
		
		if (position==0) { //맨 앞 노드 빼는 경우
			head=tempNode.next;
		}
		else { //중간 노드 찾으러 가기
			for (i=0; i<position;i++) { //지워지는 노드는 temp가 된다. 그러면 pre는 temp의 next를 가리키면 된다.
				preNode=tempNode;
				tempNode=tempNode.next;
			}
			preNode.next=tempNode.next;
		}
		count--;
		
		return tempNode; //삭제되는 노드.

	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll() //노드 프린트하기
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}

