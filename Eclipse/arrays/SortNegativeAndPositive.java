package arrays;

public class SortNegativeAndPositive {
	
	public static void move(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            if(arr[start]>=0){
                 int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        // start++;
                        end--;
            }
            else{
                start++;
            }
        }
	}
	
	public static void main (String[] args) {
		int[] arr = { -12, 11, -13, -5,
                   6, -7, 5, -3, 11 };
		move(arr);
		for (int i=0;i<arr.length ;i++ ){
		    System.out.print(arr[i] + " ");
		} 
	}
}
