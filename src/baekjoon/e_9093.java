package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class e_9093 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();

		for(int i=0; i<testCase; i++) {
			Stack stack = new Stack<>();
			String s = sc.nextLine();
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j) == ' ') {
					while(!stack.empty()) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				}else {
					stack.add(s.charAt(j));
				}
			}
			while(!stack.empty()) {
				System.out.print(stack.pop());
			}
			System.out.println();
		}
		
	}
}


