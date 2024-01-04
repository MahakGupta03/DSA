package arrays;

public class BuySellStock {
	public static int maxProfit(int arr[]) {
		int buyS=arr[0],profit = 0,n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]<buyS) {
				buyS=arr[i];
			}
			else if(arr[i]-buyS>profit){
				profit=arr[i]-buyS;
			}
		}
		return profit;
}


public static void main(String[] args) {
	int arr[]= {7,1,5,3,6,4};
	System.out.println(maxProfit(arr));
	
}

}
