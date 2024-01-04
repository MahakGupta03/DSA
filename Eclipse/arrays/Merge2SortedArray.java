package arrays;

public class Merge2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,4,6,8};
		int arr2[] = {3,5,6,7,9};
		int n = arr1.length;
		int m = arr2.length;
		int f = n+m;
		int arr3[] = new int[f];
		
		int i=0; 
		int j=0;
		int k=0;
		
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				k++;
				i++;
				
			}else {
				arr3[k] = arr2[j];
				k++;
				j++;
				
			}
		}
		while(i<n) {
			arr3[k] = arr1[i];
			k++;
			i++;
			
		}
		while(j<m) {
			arr3[k] = arr2[j];
			k++;
			j++;
			
		}
		
		for (int p = 0; p < arr3.length; p++) {
			System.out.print(arr3[p] + " ");
		}

	}

}
