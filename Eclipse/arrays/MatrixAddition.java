package arrays;

import java.util.Scanner;

public class MatrixAddition {
	
	public static int[][] matrixAddition(int nums1[][],int nums2[][])
	{
		int finalMatrix[][] = new int [nums1.length][nums2.length];
		for(int i = 0 ; i < nums1.length ; i++) {
			for(int j = 0 ; j < nums2.length ; j++) {
				finalMatrix[i][j] = nums1[i][j]+ nums2[i][j];
			}
		}
		return finalMatrix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix 1");
		int size1 = sc.nextInt();
		int arr1[][] = new int[size1][size1];
		System.out.println("Enter elements of matrix 1");
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter size of matrix 2");
		int size2 = sc.nextInt();
		int arr2[][] = new int[size2][size2];
		System.out.println("Enter elements of matrix 2");
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size1; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		int arrF[][] = matrixAddition(arr1,arr2);
		
		for (int i = 0; i < arrF.length; i++) {
			for (int j = 0; j < arrF[0].length; j++) {
				System.out.print(arrF[i][j] + " ");
			}
			System.out.println();
		}

	}

}
