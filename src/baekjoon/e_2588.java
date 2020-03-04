package baekjoon;

import java.util.Scanner;

public class e_2588 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(num1*(num2%10));
		System.out.println(num1* ((num2%100)/10) );	// 괄호로 연산 우선순위 묶어주기!!!
		System.out.println(num1*(num2/100));
		System.out.println(num1*num2);
	}
}