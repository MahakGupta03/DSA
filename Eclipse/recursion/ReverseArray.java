package recursion;

public class ReverseArray {
//	USING 2 POINTERS
	public static void reverseUsingTwoPointers(int s, int e, int[]arr) {
		if(s>=e) return;
		swap(s,e,arr);
		reverseUsingTwoPointers(s+1, e-1, arr);
	}
	
//	USING 1 POINTER
	public static void reverseUsingOnePointer(int i, int n, int[]arr) {
		if(i>=n/2) return;
		swap(i,n-i-1,arr);
		reverseUsingOnePointer(i+1, n, arr);
	}
	
	
//	SWAPING CODE
	public static void swap(int s,int e, int arr[]) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
//		reverseUsingTwoPointers(0, n-1, arr);
		reverseUsingOnePointer(0, n, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
