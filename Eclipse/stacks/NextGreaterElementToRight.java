package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElementToRight {
	
	public static ArrayList<Integer> GreaterElementToRight(int arr[] , int size){
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> l = new ArrayList<>();
//		for(int i=size-1;i>=0;i--) {
		for (int i=0;i<size;i++) {
			if(s.isEmpty()) {
				l.add(-1);
			}
			else if(s.size()>0 && s.peek()>arr[i]) {
				l.add(s.peek());
			}
			else if(s.size()>0 && s.peek()<=arr[i]) {
				while(s.size()>0 && s.peek()<=arr[i]) {
					s.pop();
				}
				if(s.size()==0) {
					l.add(-1);
				}else {
					l.add(s.peek());
				}
			}
			s.add(arr[i]);
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,2,4};
		int size = arr.length;
		ArrayList<Integer> list = GreaterElementToRight(arr , size);
//		for(int i=list.size()-1;i>=0;i--) {
//			System.out.print(list.get(i)+" ");
//		}
		
//		for(int i=0;i<size;i++) {
//			System.out.print(list.get(i)+" ");
//		}
		
		for(int i: list) {
			System.out.print(i + " ");
		}

	}

}
