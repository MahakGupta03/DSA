package stacks;

public class StackWithLinkedList {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	static class Stack{
		static Node head = null;
		
		public static boolean isEmpty() {
			return (head==null);
		}
		
		public static void push(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head = newNode;
		}
		
		public static int pop() {
			if(isEmpty()) {
				System.out.println("Stack Underflow");
				return -1;
			}
			int ele = head.data;
			head = head.next;
			return ele;
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Stack Underflow");
				return -1;
			}
			return head.data;
		}
		
	}
	
//	static class Stack{
//		static Node head = null;
//		static Node tail = null;
//		
//		public static boolean isEmpty() {
//			return (head==null && tail==null);
//		}
//		
//		public static void push(int data) {
//			Node newNode = new Node(data);
//			if(isEmpty()) {
//				head=tail=newNode;
//				return;
//			}
//			tail.next=newNode;
//			tail=tail.next;
//		}
//		
//		public static int pop() {
//			Node curr = head;
//			int ele = tail.data;
//			if(head==tail) {
//				head=tail=null;
//				return ele;
//			}
//			while(curr.next!=tail) {
//				curr=curr.next;
//			}
//			tail=curr;
//			return ele;
//		}
//		
//		public static int peek() {
//			return tail.data;
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
//		System.out.println(s.pop());
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
