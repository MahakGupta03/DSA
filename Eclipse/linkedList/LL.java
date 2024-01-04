package linkedList;

public class LL {
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	public class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
			
		}
	}
	
	//add node to at first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//add node at last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	//delete First element
	public void deleteFirst() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delete last element
	public void deleteLast() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
//		Node currNode = head;
//		Node preNode = null;
//		
//		while(currNode.next!=null) {
//			preNode = currNode;
//			currNode = currNode.next;
//		}
//		preNode.next = null;
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secLast = secLast.next;
		}
		secLast.next = null;
		
	}
	
	//print List
	public void printList() {
		
		if(head == null) {
			System.out.println("Empty List");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("null");
	}
	
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {

		LL list = new LL();
		list.addFirst("This");
		list.printList();
		
		list.addLast("is");
		list.printList();
		
		list.addLast("a");
		list.printList();
		
		list.addLast("List");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
		
		list.addFirst("Hello!!");
		list.printList();

		System.out.println(list.getSize());

	}

}
