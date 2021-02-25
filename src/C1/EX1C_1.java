package C1;

import java.util.Scanner;

public class EX1C_1 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int a = sc1.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int b = sc1.nextInt();
		System.out.print("세번째 수를 입력하세요 : ");
		int c = sc1.nextInt();
		
		int result = mid3(a,b,c);
		System.out.println(result);
	}
	
	static int mid3(int a, int b, int c) {
		int mid = 0;
		if(a>=b&&b>=c) {
			mid = b;
		} else if (c>=b&&b>=a) {
			mid = b;
		} else if (b>=a&&a>=c) {
			mid = a;
		} else if (c>=a&&a>=b) {
			mid = a;
		} else if (b>=c&&c>=a) {
			mid = c;
		} else if (a>=c&&c>=b) {
			mid = c;
		}
		
		return mid;
	}
}
	
