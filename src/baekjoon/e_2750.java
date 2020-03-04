package baekjoon;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

	// 정답 코드
//public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//
//    int n = input.nextInt();
//    int[] list = new int[n];
//
//    for (int i = 0; i < n; ++i) {
//        list[i] = input.nextInt();
//    }
//
//    Arrays.sort(list);
//
//    for (int k : list) {
//        System.out.println(k);
//    }
//}

public class e_2750 {

	public static void main(String[] args) {

		HashSet<Integer>set = new HashSet<Integer>();
		ArrayList<Integer>arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			
			arr.add((int) (Math.random()*1000) + 1);
		}
		
		ArrayList<Integer> list = new ArrayList();
		list.addAll(set);
		Collections.sort(arr);
		
		for(int j=0; j<list.size(); j++) {
			System.out.println(arr.get(j));
		}
		
	}

}
