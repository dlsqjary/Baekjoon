package baekjoon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class e_1453 {

	public static void main(String[] args) {

		int[] arr;
		int[] arr1;
		int cnt = 0;
		HashSet set = new HashSet();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("손님 숫자 입력: ");
		int num = sc.nextInt();
		arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("자리 입력: ");
			arr[i] = sc.nextInt();
			set.add(arr[i]);
		}
		System.out.print("중복된 자리수: " + (arr.length - set.size()) );
		
		//System.out.println(cnt);

//		for(int i=0; i<num; i++) {
//			System.out.print("원하는 자리 입력: ");
//			arr[i] =  sc.nextInt();
//			t.add(arr[i]);
//			
//		}
//		
//		Iterator it = t.iterator();
//
//		while(it.hasNext()) {
//			if(it.hasNext() ==  true) {
//				++cnt;
//			}
//			System.out.println(it.next());
//		}
//		System.out.println(cnt);
		
	}

}
