package linkedList;

import linkedList.LL.Node;

public class ReverseLinkedList {

	Node head;

	public class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public void addLast(int data) {
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
	
	//iteratively reversing linked list
	public void reverseIterate() {
		if(head == null || head.next == null) {
			return;
		}
		
		Node prev = head;
		Node curr = head.next;
		while(curr!=null) {
			Node nextNode = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = nextNode;
		}
		head.next = null;
		head = prev;
		
	}
	
	//Recursively reversing linked list
	public Node reverseRecursive(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}


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
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();
		
		list.reverseIterate();
		list.printList();
		
		list.head = list.reverseRecursive(list.head);
		list.printList();

	}

}
