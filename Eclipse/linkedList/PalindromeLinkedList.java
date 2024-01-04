package linkedList;

public class PalindromeLinkedList {
	
	 Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	public boolean palindrome(Node head) {
		if(head == null) {
			return true;
		}
		Node mid = middle(head);
		Node last = reverse(mid.next);
		Node currNode = head;
		while(last!=null) {
			if(last.data != currNode.data) {
				return false;
			}
			currNode = currNode.next;
			last = last.next;
		}
		return true;
	}
	
	public Node middle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next == null || fast.next.next == null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public Node reverse(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		Node prev = head;
		Node curr = head.next;
		while(curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		head.next = null;
		head = prev;
		return head;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Empty List");
			return;
		}
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println("null");
		
	}

	public static void main(String[] args) {
		PalindromeLinkedList list = new PalindromeLinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(2);
		list.addLast(1);
		list.print();
		
//		System.out.println(list.palindrome(list.head));
		boolean b = list.palindrome(list.head);
		System.out.println(b);

	}

}
