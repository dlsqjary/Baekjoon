package baekjoon;

import java.util.Scanner;

public class e_2903 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = 1 + (int)Math.pow(2, n);
		System.out.println(num * num);
	}

}
