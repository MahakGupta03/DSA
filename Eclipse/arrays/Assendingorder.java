package arrays;

import java.util.Scanner;

public class Assendingorder {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		boolean isAsending = true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isAsending = false;		
			}
		}
		if(isAsending) {
			System.out.println("Array is sorted in asending order");
		}else {
			System.out.println("Array is not sorted in aseending order");
		}
	}

}
