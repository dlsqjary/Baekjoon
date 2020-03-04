package baekjoon;

import java.util.Scanner;

public class e_2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.print(s.charAt(0));
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '-') {
				System.out.print(s.charAt(i+1));
			}
		}
	}
}
