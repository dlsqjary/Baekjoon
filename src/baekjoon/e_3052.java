package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class e_3052 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[10];
		int[]re = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<arr.length; j++) {
			re[j] = arr[j] % 42;
		}
		
		HashSet<Integer> cnt = new HashSet<Integer>();
		
		for(int k=0; k<arr.length; k++) {
			cnt.add(re[k]);
		}
		System.out.println(cnt.size());
	}

}
