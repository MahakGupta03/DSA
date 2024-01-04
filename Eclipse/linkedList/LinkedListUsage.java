package linkedList;

import java.util.Scanner;

public class LinkedListUsage {

	public static NodeForLinkedList<Integer> createLinkedList() {
		Scanner sc = new Scanner(System.in);
		
		NodeForLinkedList<Integer> head = null;
		NodeForLinkedList <Integer>temp = null;
		System.out.println("Enter data");
		int data = sc.nextInt();
		while(data!=-1) {
			NodeForLinkedList<Integer> newNode = new NodeForLinkedList<>(data);
			if(head==null) {
				head = newNode;
				temp = newNode;
			}else {
				temp.next = newNode;
				temp = temp.next;
				
			}
			System.out.println("Enter data");
			data = sc.nextInt();
		}
		
		return head;
	}
	
	public static NodeForLinkedList<Integer> insertAtGivenPosition(NodeForLinkedList<Integer>head, int pos){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		int data = sc.nextInt();
		NodeForLinkedList<Integer> newNode = new NodeForLinkedList<Integer>(data);
		NodeForLinkedList<Integer>curr = head;
		int count =0;
		while(curr!=null) {
			count++;
			curr = curr.next;
		}
		
		if(pos>count) {
			System.out.println("invalid position");
			return head;
		}
		count = 1;
		curr = head;
		while(count!=pos-1) {
			curr = curr.next;
			count++;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
	}
	
	public static void print(NodeForLinkedList head) {
		NodeForLinkedList<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NodeForLinkedList<Integer> head = createLinkedList();
		print(head);
		System.out.println();
		System.out.println("Enter position");
		int pos = sc.nextInt();
		head = insertAtGivenPosition(head , pos);
		print(head);

	}

}
