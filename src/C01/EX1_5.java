package C01;

import java.util.Scanner;

public class EX1_5 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("정수(n)를 입력하세요 : ");
		int n = sc1.nextInt();
		
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = sum+i;
		}
		
		System.out.println("정수의 총합은: "+sum+" 입니다.");
	}
}
