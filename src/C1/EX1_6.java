package C1;

import java.util.Scanner;

public class EX1_6 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("정수(n)를 입력하세요 : ");
		int n = sc1.nextInt();		
		int sum = 0;
				
		do {
			System.out.println("정수(n)를 입력하세요 : ");
			n = sc1.nextInt();
		} while(n<=0); //조건 내에서 무한 반복
		
		for(int i = 1; i<=n; i++) {
			sum = sum+i;
			i++;
		}
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
