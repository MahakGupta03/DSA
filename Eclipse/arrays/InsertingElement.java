package arrays;

import java.util.Scanner;

public class InsertingElement {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]= new int[size+1];
		
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	
	public static void insertArray(int arr[],int value , int index) {
		
		for(int i=arr.length-1;i>index;i--) {
			arr[i]=arr[i-1];
				
		}
		arr[index]= value;
	}
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= takeInput();
		
		System.out.println("Enter value and index of the element you wants to insert");
		int value= sc.nextInt();
		int index = sc.nextInt(); 
		
		insertArray(arr,value,index);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
