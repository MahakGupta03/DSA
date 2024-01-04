package arrays;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int nums[]) {
		
		for(int i=0;i<nums.length;i++) {
			int min = nums[i];
			int minIndex=i;
//			int tempMin=nums[i];
//			int tempIndex = i;
			
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<min) {
//					tempMin = nums[j];
//					tempIndex = j;
//					min=tempMin;
					min = nums[j];
					minIndex = j;
				}
			}
//			if(tempMin<nums[i]) {
//				int tempVar = nums[tempIndex];
//				nums[tempIndex] =nums[i];
//				nums[i] = tempVar;
//				
//			}
			if(min<nums[i]) {
				int tempVar = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = tempVar;
				
			}
		}
		
	}
	
	

	public static int[] inputArray() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}
	
	
	public static void printArray(int nums[]) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		

	int arr[]=inputArray();
		
	selectionSort(arr);
	
	printArray(arr);

		
		
	}

}
