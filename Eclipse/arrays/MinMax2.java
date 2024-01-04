package arrays;

import java.util.Scanner;

public class MinMax2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min,max;
		min=arr[0];
		max=arr[1];
		for(int i=0;i<n;i++) {
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min:- "+min+"Max:- "+max);

	}

}
