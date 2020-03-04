package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class e_1181 {	

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		int num = sc.nextInt();
		sc.nextLine();

		for(int i=0; i<num; i++) {
			hs.add(sc.nextLine());
		}


		ArrayList<String> list = new ArrayList<String>(hs);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() > o2.length()) {
					return 1;
				}
				else if(o1.length() < o2.length()) {
					return -1;
				}
				else {
					return o1.compareTo(o2);
				}
			}
		});

		for(int a = 0; a<list.size(); a++) {
			System.out.println(list.get(a));
		}

	}
}
