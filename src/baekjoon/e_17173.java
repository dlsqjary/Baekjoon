package baekjoon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class e_17173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		int[]ki = new int[m];
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Set<Integer>ar = new HashSet<Integer>();
		
		for(int i=0; i<ki.length; i++) {
			ki[i] = sc.nextInt();
		}
		
		for(int i=0; i<ki.length; i++) {
			for(int j = 1; j<=n; j++ ) {
				int a = ki[i] * j;
				if(a<=n) {
					ar.add(a);
				}
			}
		}
		//sum += ar.hashCode();
		System.out.println(ar.hashCode());
	}
}
