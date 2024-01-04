package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m1[][] = { { 1,2,3 }, {4,5,6} };
		int m2[][] = { {7,8}, {9,10}, {11,12} };
		int row1 = m1.length;
		int col1 = m1[0].length;
		int row2 = m2.length;
		int col2 = m2[0].length;
		int mf[][] = new int[row1][col2];
		if(row1 == col2) {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					mf[i][j] = 0;
					for (int k = 0; k < row2; k++) {
						mf[i][j] += m1[i][k] * m2[k][j];
					}
					System.out.print(mf[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Multiplication Not Possible");
		}

		

	}

}
