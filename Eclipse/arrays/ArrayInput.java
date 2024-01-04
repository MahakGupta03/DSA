package arrays;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
		String names[]= new String[size];
		System.out.println("Enter names");
		for(int i=0;i<size;i++) {
			names[i]=sc.next();
		}
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}

	}

}
