package baekjoon;


다시!!!!!!!!!!!!!!!!!
import java.util.Scanner;

public class e_2979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] car = new int[100];
		int start, end, max = 0;
		int min = 0, sum = 0;
		
		for(int i=0; i<3; i++) {
			start = sc.nextInt();
			end = sc.nextInt();
			min = Math.min(min, start);
			max = Math.max(max, end);
			
			for(int j=start; j<end; j++) {	// 각 트럭의 주차시간 시작 시간부터 총 대수의 카운트 시작
				car[j]++;
			}
		}
		for(int i=min; i<max; i++) {
			switch (car[i]) {
			case 1:
				 sum = sum + a*car[i];
				 break;
			case 2:
				 sum = sum + b*car[i];
				 break;
			case 3:
				 sum = sum + c*car[i];
				 break;

			default:
				break;
			}
		}
		System.out.println(sum);
	}
}

