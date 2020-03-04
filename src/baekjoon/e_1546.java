package baekjoon;

import java.util.Scanner;

public class e_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double score[] = new double[n];
		double sum = 0;
		double max = 0;
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextDouble();
			
			if(score[i] > max) {
				max = score[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			sum += score[i]/max*100;
		}
		System.out.println(sum/n);
	}

}
