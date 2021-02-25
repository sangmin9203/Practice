package C1;

import java.util.Scanner;

public class EX1_8 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇단 삼각형입니까 : ");
		int n = sc1.nextInt();
		
		do {
			System.out.print("몇단 삼각형입니까(0보다 큰 정수를 입력해주세요.) : ");
			n = sc1.nextInt();
		} while(n<=0);
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
