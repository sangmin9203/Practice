package C3;

import java.util.Scanner;

public class EX3_01 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = sc1.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i<x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc1.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc1.nextInt();
		
		int i;
				
		for(i = 0; i<x.length; i++) {
			if(x[i]==search) {
				break;
			}
			
		}
		
		System.out.println(search+"은(는) x["+i+"]에 있습니다.");
		
		
	}
}
