package C6;

import java.util.Arrays;
import java.util.Scanner;

public class EX6_13ArraySort {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int nx = sc1.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i<nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc1.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i = 0; i<nx; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
		
	}
}
