package baekjoon;

import java.util.Scanner;

//replaceAll 과 replace의 사용법은 다르다!!
// 문자열을 변경한 후 그 값을 다른 변수나 본인에게 넣어줘야 제대로 출력이 가능하다! 그냥 하면 안됨!!
public class e_2864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0, min = 0;
		String num1 = sc.next();
		String num2 = sc.next();
		String a = num1;
		String b = num2;
		String c = num1;
		String d = num2;
		int num3, num4;
		
		a = a.replaceAll("6", "5");
		b = b.replaceAll("6", "5");
		
		num3 = Integer.parseInt(a);
		num4 = Integer.parseInt(b);
		min += num3;
		min += num4;
		c = c.replaceAll("5", "6");
		d = d.replaceAll("5", "6");
		
		num3 = Integer.parseInt(c);
		num4 = Integer.parseInt(d);
		max += num3;
		max += num4;

		System.out.println(min+ " " + max);
	}
}
// 신박한 해답

//public class Main {
//    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    public static void main(String args[]) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String A = st.nextToken().replaceAll("5", "6");
//        String B = st.nextToken().replaceAll("5", "6");
//        bw.write((Integer.parseInt(A.replaceAll("6", "5")) + Integer.parseInt(B.replaceAll("6", "5"))) + " " + (Integer.parseInt(A) + Integer.parseInt(B)));
//        bw.flush();
//    }


//처음 생각했던 방식

//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	int max = 0, min = 0;
//	int max2 = 0, min2 = 0;
//	String num1 = sc.next();
//	String num2 = sc.next();
//	
//	for(int i=0; i<num1.length(); i++) {
//		if(num1.charAt(i) == '5') {	//5인 숫자가 있을때 6을 모두 5로 바꾸어 최소수로 만들기
//			num1.replace('6', '5');
//			int num3 = Integer.parseInt(num1);
//			min += num3;
//			
//			num1.replace('5', '6');	// 5인 숫자가 있을떄 5를 모두 6으로 만들어 최대수 만들기
//			int num4 = Integer.parseInt(num1);
//			max += num4;
//			
//		} else if(num1.charAt(i) == '6'){
//			int num3 = Integer.parseInt(num1);
//			min += num3;
//			
//			int num4 = Integer.parseInt(num1);
//			max += num4;
//			
//		}else {
//			
//		}
//	}
//	System.out.println(min + " " + max);
//	
//	for(int i=0; i<num2.length(); i++) {
//		if(num2.charAt(i) == '6') {
//			num2.replace('6', '5');
//			int num3 = Integer.parseInt(num2);
//			min += num3;
//			
//			num2.replace('5', '6');
//			int num4 = Integer.parseInt(num2);
//			max += num4;
//		}
//	}
//	
//	System.out.println(min+ " " + max);
//}