package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PractiseLinkedList {
//	Node head;
//	
//	public class Node{
//		int data;
//		Node next;
//		
//		 Node(int data) {
//			this.data = data;
//			this.next = null;
//		}
//	}
//	
//	public void addEle(int data) {
//		Node node = new Node(data);
//		if(head == null) {
//			head = node;
//			return;
//		}
//		Node curr = head;
//		while(curr.next!=null) {
//			curr = curr.next;
//		}
//		curr.next = node;
//	}
//	
//	public void search() {
//		Node curr = head;
//		int count = 0;
//		while(curr.next!=null) {
//			if(curr.data == 7) {
//				System.out.println(count);
//				return;
//			}else {
//				count++;
//				curr = curr.next;
//			}
//		}
//	}
//	
//	public void printList() {
//		if(head == null) {
//			System.out.println("Empty List");
//			return;
//		}
//		Node curr = head;
//		while(curr != null) {
//			System.out.print(curr.data+"->");
//			curr = curr.next;
//		}
//		System.out.println("Null");
//	}

	public static void main(String[] args) {
//		PractiseLinkedList list = new PractiseLinkedList();
//		list.addEle(1);
//		list.addEle(5);
//		list.addEle(7);
//		list.addEle(3);
//		list.addEle(8);
//		list.addEle(2);
//		list.addEle(3);
//		list.printList();
//		list.search();
		
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of linked list");
		int s = sc.nextInt();
		for(int i=0;i<s;i++) {
			list.add(sc.nextInt());
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>25) {
				list.remove(i);
			}
		}
		
		System.out.println(list);

	}

}
