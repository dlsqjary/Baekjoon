package baekjoon;

import java.util.Scanner;

public class e_2010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			max += arr[i];
		}
		System.out.println(max - (n-1));
	}
}
