package arrays;

public class MoveZerosToRight {
	public static void main(String[] args) {
		int arr[] = { 0, 8, 0, 1, 3, 0, 0 };
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int mid = 0;
//		while (mid <= high) {
//			if (arr[low] != 0) {
//				int temp = arr[mid];
//				arr[mid] = arr[low];
//				arr[low] = temp;
//				mid++;
//				low++;
//			} else if (arr[mid] != 0) {
//				int temp = arr[mid];
//				arr[mid] = arr[low];
//				arr[low] = temp;
//				low++;
//				mid++;
//			} else {
//				mid++;
//			}
//
//		}
		
		 while(mid<=high){
	            if(arr[mid]!=0){
	                 int temp = arr[mid];
	                arr[mid]= arr[low];
	                arr[low] = temp;
	               
	                low++;
	            }
	             mid++;
		 }
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
