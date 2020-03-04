package baekjoon;

import java.util.Scanner;

// 다 해놓고 너무 꼬아서 생각하지 말자. 
public class e_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int n = sc.nextInt();
		int cnt = 0;
		num = n;
		
		do {
			num = num % 10 * 10 + (num / 10 + num % 10) % 10;
            cnt++;
        } while (n != num);
		System.out.println(cnt);
	}
}
