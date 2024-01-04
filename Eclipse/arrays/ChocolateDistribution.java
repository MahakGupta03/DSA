package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ChocolateDistribution {
	public static int findMin(int arr[],int n,int m) {
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for(int i=0;i+m-1<n;i++) {
			int diff=arr[i+m-1]-arr[i];
			if(diff<min) {
				min=diff;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("Enter the sizew of array");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Create array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter no. of students:-");
		int m= sc.nextInt();
		System.out.println("Minimum Difference is:"+findMin(arr, n,m));

	}

}
