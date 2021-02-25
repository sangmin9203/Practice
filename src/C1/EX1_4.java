package C1;

import java.util.Scanner;

public class EX1_4 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("정수(n)의 값을 입력 하세요 : ");
		int n = sc1.nextInt();
		int i = 0;
		
		int sum = 0;
		while(i<=n) {
			sum = sum+i;
			i++;
		}
		
		System.out.println("정수의 총 합은 : "+sum+" 입니다.");
	}
}
