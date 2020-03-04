package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class e_5544 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		int n, num;
	
		n = sc.nextInt();
		num = (n * (n-1)) / 2;
		int[]rank = new int[n];
		for(int i=0; i<n; i++) {
			rank[i] = 1;
		}
		int[][] w = new int[n][2];
		int[][] grade = new int[n][2];
		
		for(int i=0; i<num; i++) {
			int a, b, c, d;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			
			if(c>d) {
				w[a-1][0] += 3;
			} else if(c<d) {
				w[b-1][0] += 3;
			} else if(c == d) {
				w[a-1][0] += 1;
				w[b-1][0] += 1;
			}
		
		}
		
//		for(int i=0; i<n; i++) {
//			System.out.println(w[i][0]);
//		}
//		System.arraycopy(w, 0, grade, 0, n);
		
//		Arrays.sort(w, new Comparator<int[]>() {
//		@Override
//		public int compare(int[] o1, int[] o2) {
//		
//				return Integer.compare(o2[0], o1[0]);
//			}
//		});
		
		//for(int i=0; i<n; i++) {
//		for(int j = 0; j<n; j++) {
//			if(w[i][0] < w[j][0]) {
//				rank[i] = rank[i]+ 1;
//			}
//		}
	//}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(w[i][0] < w[j][0]) {
					rank[i] = rank[i]+ 1;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(rank[i]);
		}
	}
}



















