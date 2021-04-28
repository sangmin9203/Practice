package C6;

import java.util.Scanner;

public class EX6_04Straight {
	
	static void swap(int [] a, int idx1, int idx2) {
		int imsi = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = imsi;
	}
	
	
	static void selectionSort(int [] a, int n) {
		for(int i = 0; i< n-1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++) {
				if(a[j] < a[min]) {
					min = j;
					swap(a, i, min);
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("단순 선택 정렬");
		System.out.print("요솟수 : ");
		int nx = sc1.nextInt();
		int [] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc1.nextInt();
		}
		
		
		selectionSort(x, nx); //배열 x를 버블 정렬합니다.
		
		for(int i = 0; i<nx; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
		
		
		
	}
}
