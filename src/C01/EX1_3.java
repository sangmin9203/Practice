package C01;

import java.util.Scanner;

public class EX1_3 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		double a = sc1.nextDouble();
		
		if(a>0) {
			System.out.println("이 수는 양수 입니다.");
		} else if(a<0) {
			System.out.println("이 수는 음수 입니다.");
		} else
			System.out.println("이 수는 0 입니다.");
	}
}
