package baekjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class e_10871 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>list = new ArrayList<Integer>();
		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		for(int i=0; i<n; i++) {
			if(list.get(i) < x) {
				System.out.print(list.get(i) + " ");
			}
		}
	}

}

