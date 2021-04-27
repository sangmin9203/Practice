package C2;

import java.util.Scanner;

public class EX2_04 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in); 
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람의 수 : ");
		int n = sc1.nextInt();
		int [] a = new int[n];
		
		for(int i = 0; i<a.length; i++) {
			System.out.print("height["+i+"] : ");
			a[i] = sc1.nextInt();
		}
		
		System.out.println("최댓값은 "+maxOf(a)+"입니다.");
		
		
		
	}
	
	static int maxOf(int [] a) {
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
		
	}
}
