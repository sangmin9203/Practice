package C06;

import java.util.Scanner;

public class EX6_09Quick {
	//퀵 정렬
	
	static void swap(int[] a, int idx1, int idx2) {
		int imsi = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = imsi;
	}
	
	//퀵 정렬
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];  //피벗
		
		do {
			while(a[pl]<x) {
				pl++;
			}
			while(a[pr]>x) {
				pr--;
			}
			if(pl<=pr) {
				swap(a,pl++,pr--);
			}
		} while(pl<=pr);
		
		if(left < pr) {
			quickSort(a, left, pr);
		}
		if(pl<right) {
			quickSort(a, pl, right);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("퀵 정렬");
		System.out.print("요솟수 : ");
		int nx = sc1.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i<nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc1.nextInt();			
		}
		
		quickSort(x, 0, nx-1);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] = " + x[i]);
		}
				
	}
}
