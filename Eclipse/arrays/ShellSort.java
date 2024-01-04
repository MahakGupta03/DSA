package arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,3,4,5,7,8,9,10};
		int n = arr.length;
		int h=1;
		int mid = 3*h+1;	
		int start = 0;
		int end = n-1;
		while(mid<=end) {
			if(arr[start]>arr[mid]) {
				int temp = arr[start];
				arr[start]=arr[mid];
				arr[mid] = temp;
			}
			mid++;
			start++;
		}
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
