package baekjoon;

import java.util.Scanner;

public class e_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int cnt = 0;
		n = sc.nextInt();
		
		if(n<100) {
			
			System.out.println(n);
		}
		
		cnt = 99;	// 100미만의 숫자는 모두 한수
		if(n>=100) {
		for(int i=100; i<=n; i++) {	// 100부터 입력한 값까지 반복
			int a = i/100;	// 백의 자리수
			int b =(i/10)%10;	// 십의 자리수
			int c = i %10;	// 일의 자리수
			
			if(a-b == b-c) {
				cnt++;
			}
		}
		System.out.println(cnt);
		}
	}
}
