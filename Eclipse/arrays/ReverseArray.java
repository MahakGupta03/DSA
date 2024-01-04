package arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void reverseArr(int arr[],int start,int end){
		int temp;
		if(start>=end) return;
		
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			reverseArr(arr,start+1,end-1);
		
	}
	public static void printArr(int arr[],int n) {
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			
		}
		reverseArr(arr,0,n-1);
		printArr(arr,arr.length);
		

	}
}
