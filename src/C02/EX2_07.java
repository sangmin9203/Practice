package C02;

import java.util.Scanner;

public class EX2_07 {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int a = sc1.nextInt();
		int [] na = new int[a];
		
		for(int i = 0; i<na.length; i++) {
			System.out.print("a["+i+"] : ");
			na[i] = sc1.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int b = sc1.nextInt();
		int [] nb = new int[b];
		
		for(int i = 0; i<nb.length; i++) {
			System.out.print("b["+i+"] : ");
			nb[i] = sc1.nextInt();
		}
		
		
		
		System.out.println("배열 a와 b는 "+(equals(na, nb) ? "같습니다.":"다릅니다."));
		
	}
	
	static boolean equals(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		} else if(a.length == b.length) {
			for(int i = 0; i<a.length; i++) {
				if(a[i] != b[i]) {
					return false;
				} //else true를 사용하면 하나라도 같으면 true가 리턴 되니까 조심할것!
			}
		}
		return true;
	}
}
