package arrays;

public class MergeSort {
	
	public static void merge(int arr1[] , int arr2[] , int arr[]) {
		int n = arr1.length;
		int m = arr2.length;
		
		int i=0; 
		int j=0;
		int k=0;
		
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				arr[k]=arr1[i];
				k++;
				i++;
				
			}else {
				arr[k] = arr2[j];
				k++;
				j++;
				
			}
		}
		while(i<n) {
			arr[k] = arr1[i];
			k++;
			i++;
			
		}
		while(j<m) {
			arr[k] = arr2[j];
			k++;
			j++;
			
		}
		

	}
	
	public static void mergeSort(int arr[]) {
		
		if(arr.length<=1) {
			return;
		}
		
		int n = arr.length;
		int l1 = n/2;
		int l2 = n-l1;
		int b[] = new int[l1];
		int c[] = new int[l2];
		int k=0;
		for(int i=0;i<l1;i++) {
			b[i] = arr[k];
			k++;
		}
		for(int i=0;i<l2;i++) {
			c[i] = arr[k];
			k++;
		}
		
		mergeSort(b);
		mergeSort(c);
		merge(b,c,arr);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,4,1,2,8,5,6};
		mergeSort(arr);
		
		for (int p = 0; p < arr.length; p++) {
			System.out.print(arr[p] + " ");
		}

	}


}
