package arrays;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class SpiralOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m = sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		int rowStart =0;
		int rowEnd = n-1;
		int colStart =0;
		int colEnd =m-1;
		while(rowStart<=rowEnd && colStart<=colEnd) {
			for(int col=colStart;col<=colEnd;col++) {
				System.out.print(arr[rowStart][col]+" ");
			}
			rowStart++;
			for(int row=rowStart;row<=rowEnd;row++) {
				System.out.print(arr[row][colEnd]+" ");
			}
			colEnd--;
			for(int col=colEnd;col>=colStart;col--) {
				System.out.print(arr[rowEnd][col]+" ");
			}
			rowEnd--;
			for(int row=rowEnd;row>=rowStart;row--) {
				System.out.print(arr[row][colStart]+" ");
			}
			colStart++;
		}
		

	}

}
