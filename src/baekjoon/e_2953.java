package baekjoon;


import java.util.Scanner;

public class e_2953 {

	public static void main(String[] args) {
		int[][]arr = new int[5][4];
		int[] avg = new int[5];
		int max = 0, cnt=0;

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = sc.nextInt();
				avg[i] += arr[i][j];
			}
			if(max < avg[i]) {
				max = avg[i];
				cnt = i+1;
			}
		}
		System.out.printf("%d %d", cnt, max);
	}

}