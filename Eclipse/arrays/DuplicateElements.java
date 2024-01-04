package arrays;

import java.util.Scanner;

public class DuplicateElements {
	
	public static void duplicateElement(int arr[]) {
		int u = 0;
		System.out.println("Unique elements are");
//		System.out.println("Duplicate Elements are");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if(arr[i]==u) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					u=arr[j];
					break;
				}
			}
//			if (count > 1) {
//				System.out.println(arr[i]);
//			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		
		duplicateElement(arr);
		
		

	}

}
