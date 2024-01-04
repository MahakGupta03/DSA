package arrays;

import java.util.Scanner;

public class DeleteElement {
	
	public static void deleteElement(int arr[],int element) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element) {
				for (int j = i; j < arr.length-1; j++) {
					arr[j]=arr[j+1];
				}
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to delete");
		int el = sc.nextInt();
		
		deleteElement(arr,el);
		
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		

	}
	

}
