package baekjoon;

import java.util.Scanner;

public class e_5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]min = new int[4];
		int[]man = new int[4];
		int s = 0;
		int t = 0;
		for(int i=0; i<min.length; i++) {
			min[i] = sc.nextInt();
			s += min[i];
		}
		for(int i=0; i<man.length; i++) {
			man[i] = sc.nextInt();
			t += man[i];
		}
		if(s>t) {
			System.out.println(s);
		}else if(s == t) {
			System.out.println(s);
		}else {
			System.out.println(t);
		}
	}
}
