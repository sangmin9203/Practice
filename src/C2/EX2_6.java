package C2;

import java.util.Scanner;

public class EX2_6 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = sc1.nextInt();
		
		int [] x = new int[n];
		for(int i = 0; i<x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc1.nextInt();
		}
		
		reverse(x);
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i<x.length; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
		System.out.println();
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
}
