package baekjoon;

import java.util.Scanner;

public class e_10817 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int num=0;
		
		if((a>= b && b>=c) || (c>=b && b>=a) )
			num = b;
		else if((b>=a && a>=c) || (c>=a && a>=b) )
			num = a;
		else
			num = c;
		System.out.println(num);
	}

}
