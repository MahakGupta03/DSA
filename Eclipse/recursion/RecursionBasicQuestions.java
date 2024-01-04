package recursion;

import java.util.Scanner;

public class RecursionBasicQuestions {
	
//	PRINT NAME N TIMES USING RECURSION
	public static void printName(int i,int n) {
		if(i>n) return;
		System.out.println("yash");
		printName(i+1, n);
	}

//	PRINT FROM 1 TO N USING RECURSION
	public static void print1ToN(int i,int n) {
		if(i>n) return;
		System.out.println(i);
		print1ToN(i+1, n);
	}
	
//	PRINT 1 TO N USING BACKTRACKING
	public static void print1ToNBacktrack(int n) {
		if(n<1) return;
		print1ToNBacktrack(n-1);
		System.out.println(n);
	}
	
	
//	PRINT N TO 1 USING RECURSION
	public static void printNTo1(int n) {
		if(n==0) return;
		System.out.println(n);
		printNTo1(n-1);
	}
	
	
//	PRINT N TO 1 USING BACKTRACKING
	public static void printNTo1Backtrack(int i,int n) {
		if(i>n) return;
		printNTo1Backtrack(i+1,n);
		System.out.println(i);
	}
	
	
//	PRINT SUM OF N NATURAL NUMBERS
	public static int sumofN(int n) {
		if(n==1) return 1;
		return n+sumofN(n-1);
	}
	
	
//	PRINT FACTORIAL OF N NUMBERS
	public static int factorial(int n) {
		if(n==1) return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		printName(1, n);
//		print1ToN(1, n);
//		printNTo1(n);
//		print1ToNBacktrack(n);
//		printNTo1Backtrack(1, n);
//		System.out.println(sumofN(n));
		System.out.println(factorial(n));

	}

}
