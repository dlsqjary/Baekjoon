package baekjoon;

import java.util.Scanner;

public class e_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h , m;
		int resultH, resultM;
		h = sc.nextInt();
		m = sc.nextInt();

		resultH = h;
		resultM = m-45;
		if(resultM<0) {
			resultM += 60;
			resultH -= 1;
			if(resultH<0) {
				resultH += 24;
			}
		}
		System.out.println(resultH + " " + resultM);
	}
}
