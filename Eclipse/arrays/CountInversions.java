package arrays;

//What is an inversion of an array?Definition:for all i&j<size of array,if i<j then you have to find pair(A[i],A[j])such that A[j]<A[i].

/*Input Format: N = 5, array[] = {1,2,3,4,5}

Result: 0

Explanation: we have a sorted array and the sorted array 
has 0 inversions as for i < j you will never find a pair 
such that A[j] < A[i]. More clear example: 2 has index 1 
and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an 
inversion.*/

public class CountInversions {
	
	/* Brute Force */
	
	public static void getInversion(int arr[],int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<j && arr[j]<arr[i]){
					count++;
				}
			}
		}
		System.out.println(count);
//		return count;
	}
	
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
//		System.out.println(getInversion(arr,arr.length));
		getInversion(arr,arr.length);
	}

}
