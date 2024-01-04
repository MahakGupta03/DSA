package recursion;

import java.util.ArrayList;

public class PrintSunsiquences {
	
	public static void printF(int i, ArrayList<Integer>list, int n, int []arr) {
		if(i==n) {
			for(int it : list) {
				System.out.print(it + " ");
			}
			
			if(list.size()==0) {
				System.out.println("{}");
				return;
			}
			
			System.out.println();
			return;
		}
//		int element = list.get(i);
		list.add(arr[i]);
		printF(i+1,list,n,arr);
//		list.add(arr[i]);
		list.remove(list.size()-1);
		printF(i+1,list,n,arr);
//		list.remove(list.size()-1);
		


	}
	
	
	
	
//	PRINT SUSEQUENCE HAVE K SUM
	public static void printSumSubsequence(int idx , ArrayList<Integer> list, int s, int n, int sum, int []arr) {
		if(idx==n) {
			if(s==sum) {
				for(int i : list) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			return;
		}
		list.add(arr[idx]);
		s+=arr[idx];
		printSumSubsequence(idx+1, list, s, n, sum, arr);
		s-=list.get(list.size()-1);
		list.remove(list.size()-1);
		printSumSubsequence(idx+1, list, s, n, sum, arr);
	}
	
	
	
	
//	PRINT one SUSEQUENCE HAVE K SUM
	/*public static boolean printSumSubsequence(int idx , ArrayList<Integer> list, int s, int n, int sum, int []arr) {
		if(idx==n) {
			if(s==sum) {
				for(int i : list) {
					System.out.print(i + " ");
				}
				System.out.println();
				return true;
			}
			return false;
		}
		list.add(arr[idx]);
		s+=arr[idx];
		if(printSumSubsequence(idx+1, list, s, n, sum, arr)==true) return true;
		s-=list.get(list.size()-1);
		list.remove(list.size()-1);
		if(printSumSubsequence(idx+1, list, s, n, sum, arr)==true) return true;
		return false;
	}*/
	
	
	
	
//	COUNT NUMBER OF SUBSIQUENCES
	public static int countAllSubsequence(int idx , int s, int n, int sum, int []arr) {
		if(idx==n) {
			if(s==sum) {
				return 1;
			}
			return 0;
		}
		s+=arr[idx];
		int l = countAllSubsequence(idx+1, s, n, sum, arr);
		s-=arr[idx];
		int r = countAllSubsequence(idx+1, s, n, sum, arr);
		return l+r;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,2,3};
//		int []arr = {3,1,2};
//		int arr[]= {1,2,1};
		int n = arr.length;
		int sum = 3;
		ArrayList<Integer> list = new ArrayList<>();
//		printF(0,list,n,arr);
		printSumSubsequence(0,list,0,n,sum,arr);
//		System.out.println(countAllSubsequence(0, 0, n, sum, arr));
		
		
	}

}
