
package arrays;

public class InsertionSort {
	
	public static void sort(int arr[]) {
		int n = arr.length;
//		int ans[] = new int[n];
//		ans[0] = arr[0];
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			
			while(j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 15, 6, 7, 8, 17, 80, 2, 9, 28 };
		
		sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
