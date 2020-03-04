package baekjoon;

import java.util.Scanner;

/ 한번 더 보기

public class e_1932 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, max = 0;
		int[][]arr;
		num = sc.nextInt();
		arr = new int[num][num];
		arr[0][0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			for(int j=0; j<=i; j++) {
				arr[i][j] = sc.nextInt();
				
				if(j==0)	// 가장 왼쪽에 있는 숫자는 대각선 위의 값만을 가져온 후 더한다.
					arr[i][j] += arr[i-1][j];
				else if(j==i)	// 가장 오른쪽에 있는 숫자도 마찬가지로 대각선 왼쪽의 값만을 가져온 후 더한다.
					arr[i][j] += arr[i-1][j-1];
				else	// 대각선 왼쪽 위, 오른쪽 위의 숫자 중에서 큰 값을 가져온 후 더한다.
					arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
				
				max = Math.max(max, arr[i][j]);
			}
		}
		System.out.println(max);
	}

}
