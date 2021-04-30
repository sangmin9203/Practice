package C05;

import java.util.Scanner;

public class EX5_02 {
	
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		} else {
			return gcd(y, x%y);
		}
	}
	
	public static void main(String[] args) {
		//유클리드 호제법으로 최대공약수 구하기
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요. : ");
		int x = sc1.nextInt();
		System.out.print("정수를 입력하세요. : ");
		int y = sc1.nextInt();
		
		System.out.println(x+"와(과)"+y+"의 최대공약수는 "+gcd(x,y)+"입니다.");
		
	}
}
