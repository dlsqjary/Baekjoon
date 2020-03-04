package baekjoon;

import java.util.Scanner;

public class e_5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L, a, b, c, d;
		int max1 = 0, max2 = 0;
		L = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a%c == 0) {
			max1 = a/c;
		}else {
			max1 = a/c +1;
		}
		
		if(b%d == 0) {
			max2 = b/d;
		}else {
			max2 = b/d+1;
		}
		
		if(max1 < max2) {
			System.out.println(L - max2);
		} else if(max2 < max1){
			System.out.println(L - max1);
		} else {
			System.out.println(L -max1);
		}
	}
}
