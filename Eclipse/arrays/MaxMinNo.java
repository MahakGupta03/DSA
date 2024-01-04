package arrays;

import java.util.Scanner;

public class MaxMinNo {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i= 0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
			if(num[i]>max) {
				max=num[i];
			}
			
		}
		System.out.println("maximum value is "+ max );
		System.out.println("minimum value is " + min);
	}

}
