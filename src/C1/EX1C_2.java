package C1;

import java.util.Scanner;

public class EX1C_2 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("2자리의 정수를 입력하세요.");
		int n = 0;
		
		
		do {
			System.out.print("입력 : ");
			n = sc1.nextInt();
		} while(n<10||n>99); //계속조건
		//부정 연산자를 사용하면 다음과 같이 표현이 가능합니다. !(n>=10&&n<=99); //종료조건의 부정은 계속조건이다??
		System.out.println("변수 no의 값은 "+n+"가(이) 되었습니다.");
	}
}
