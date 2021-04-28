package C5;

import java.util.Scanner;

public class EX5_01 {
	
	static int factorial(int n) { //재귀함수
		if(n>0) {
			return n*factorial(n-1);
		} else
			return 1;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc1.nextInt();
		
		int result = 1;
//		for(int i = n; i>0; i--) {
//			result = result*i;
//		}
		
		result = factorial(n);
		
		
		System.out.println(n+"의 팩토리얼은 "+result+"입니다.");
	}
}
