package baekjoon;

import java.util.Scanner;

public class e_2789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			switch(s.charAt(i)) {
			case 'C': break;
			case 'A': break;
			case 'M': break;
			case 'B': break;
			case 'R': break;
			case 'I': break;
			case 'D': break;
			case 'G': break;
            case 'E': break;
			default:
				System.out.print(s.charAt(i));
                    break;
			}
		}
	}
}



//import java.util.Scanner;
//
//public class e_2789 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String s = sc.next();
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<s.length(); i++) {
//			switch(s.charAt(i)) {
//			case 'C': break;
//			case 'A': break;
//			case 'M': break;
//			case 'B': break;
//			case 'R': break;
//			case 'I': break;
//			case 'D': break;
//			case 'G': break;
//			case 'E': break;
//			default:
//				sb.append(s.charAt(i));
//				break;
//			}
//		}
//		System.out.println(sb);
//	}
//}
