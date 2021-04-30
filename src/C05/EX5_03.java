package C05;

import java.util.Scanner;

class EX5_03 {
	
	//재귀함수 이해하기
	static void recur(int n) {
//		if(n>0) {
//			recur(n-1);
//			System.out.println(n);
//			recur(n-2);
//		}
		
		while(n>0) {
			recur(n-1);
			System.out.println(n);
			n = n-2;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc1.nextInt();
		
		recur(n);
	}
}
