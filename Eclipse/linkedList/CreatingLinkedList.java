package linkedList;

public class CreatingLinkedList {
	Node head;
	Node tail;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	
	
	
//	public void addLast( int data) {
//		Node newNode = new Node(data);
//		if(head == null) {
//			head = newNode;
//			return;
//		}
//		Node curr = head;
//		while(curr.next!=null) {
//			curr = curr.next;
//		}
//		curr.next = newNode;
//		return;
//	}
	
	public void addLastWithTail(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		else {
			tail.next = newNode;
			tail = tail.next;
		}
	}
	
//	public void createCircularLL(int data) {
//		Node newNode = new Node(data);
//		if(head == null) {
//			head = newNode;
//			tail = newNode;
//			tail.next = head;
//			return;
//		}
//		tail.next = newNode;
//		tail = tail.next;
//		tail.next = head;
//	}
	
	public void insertAtGivenPosition(int data , int pos) {
		Node newNode = new Node(data);
		if(head==null) {
			return;
		}
		
		if(pos==1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		int count = 0;
		Node curr = head;
		while(curr!=null) {
			count++;
			curr = curr.next;
		}
		System.out.println("size of linked list is: " + count);
		
		if(pos>count) {
			System.out.println("Invalid Position!!!");
			return;
		}
		
		count = 1;
		curr = head;
		Node prev = null;
		while(count!=pos) {
			count++;
			prev = curr;
			curr = curr.next;
		}
		newNode.next = curr;
		prev.next = newNode;
		

		return;
		
	}
	
	public Node deleteAtGivenPosition(int pos) {
		Node curr = head;
		Node prev = null;
		int count = 1;
		while(curr!=null) {
			if(count == pos) {
				prev.next = curr.next;
				return head;
			}
			count++;
			prev = curr;
			curr = curr.next;
		}
		return head;
	}

	public void print(Node head) {
		if(head == null) {
			System.out.println("Empty linked list");
			return ;
		}
		
		
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.print("null");
//		do {
//			
//			System.out.print(curr.data + "->");
//			curr = curr.next;
//			
//		}while(curr!=head); 
//		System.out.println("head");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreatingLinkedList c = new CreatingLinkedList();
//		c.addLast(1);
//		c.addLast(2);
//		c.addLast(3);
//		c.addLast(4);
		c.addLastWithTail(8);
		c.addLastWithTail(8);
		c.addLastWithTail(8);
		c.addLastWithTail(8);
		c.insertAtGivenPosition(5, 2);
		c.print(c.head);
		System.out.println();
		c.head = c.deleteAtGivenPosition(2);
		
//		c.createCircularLL(1);
//		c.createCircularLL(2);
//		c.createCircularLL(3);
//		c.createCircularLL(4);
//		c.createCircularLL(5);
		c.print(c.head);

	}

}
