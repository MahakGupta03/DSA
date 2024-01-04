package recursion;

import java.util.Scanner;

public class PallindromeString {

	public static boolean palindrome(int i,int n, String s) {
		if(i>=n/2) return true;
		if(s.charAt(i)!=s.charAt(n-i-1)) return false;
		return palindrome(i+1, n, s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		System.out.println(palindrome(0, s.length(), s));
	}

}
