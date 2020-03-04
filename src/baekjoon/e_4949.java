package baekjoon;

한번더

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class e_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input_len, i;
		Stack<Character> stack = new Stack<Character>();
		char t;
		
		String inputS = br.readLine();
		
		while(!inputS.equals(".")) {
			stack.clear();
			
			input_len = inputS.length();
			
			for(i=0; i<input_len; i++) {
				t = inputS.charAt(i);
				if(t== '(' || t== '[') {
					stack.push(t);
				} else if(t == ')' || t == ']') {
					// stack.isEmpty() <<< 스택의 처음에 '(' 나  '[' 가 없을 경우 
					if(stack.isEmpty() || ( t==')' && stack.peek() != '(') || (t== ']' && stack.peek() != '[')) {
						stack.push(t);
						break;
					}
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			inputS = br.readLine();
		}
	}
}
