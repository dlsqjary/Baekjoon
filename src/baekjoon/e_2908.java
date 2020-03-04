package baekjoon;

import java.util.Scanner;

public class e_2908 {

	public static int flip(int num){
		int result=0;
		while(num!=0){
			result= result * 10 + num % 10;
			num /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int num3 = flip(num1);
		int num4 = flip(num2);
		
		if(num3>num4) {
			System.out.println(num3);
		}else {
			System.out.println(num4);
		}
	}

}
