package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsicutiveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>(size);
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		
		int i=0;
		while(i<list.size()-1) {
			if(list.get(i) != list.get(i+1)) {
				i++;
				continue;
			}
			list.remove(i+1);
			
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
