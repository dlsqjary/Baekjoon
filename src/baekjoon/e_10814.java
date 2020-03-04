package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class e_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[][]cli = new String[n][2];
		int[] cnt = new int[n];
		
		for(int i=0; i<n; i++) {
			cli[i][0] = sc.next();
			cli[i][1] = sc.next();
			cnt[i] = i;
		}
		
		Arrays.sort(cli, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
			
				// 나이순으로 비교한뒤 만약에 같으면 가입순서(입력순)으로 배열 정렬  (사실상 가입순서는 의미 없음)
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(cli[i][0] + " " + cli[i][1]);
		}
	}
}
