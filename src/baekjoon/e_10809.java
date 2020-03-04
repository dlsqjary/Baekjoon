package baekjoon;

import java.util.Scanner;

public class e_10809 {
	
	static void outPut(String s) {
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i) == 'a') {
//				System.out.print(s.indexOf(i));
//			}else if(s.charAt(i) == 'b'){
//				System.out.print(s.indexOf(i));
//			}
//			else {
//				System.out.print(-1);
//			}
//		}
		
		// char형도 기계어로 변환되기 전에 아스키코드 값에 의하여 숫자로 바뀌므로 이것을 이용하면 됨
		for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(s.indexOf(c) + " ");
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("문자열 입력");
		s = sc.nextLine();

		outPut(s);
		
		
	}
}
