package C03;

import java.util.Arrays;
import java.util.Scanner;

public class EX3_05 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = sc1.nextInt();
		int[] x = new int[n];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0] : ");
		x[0] = sc1.nextInt();
		
		for(int i = 1; i<x.length; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc1.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int search = sc1.nextInt();
		
		int idx = Arrays.binarySearch(x, search); //자바 자체 이진검색 메소드
		
		if(idx<0) {
			System.out.println("검색 값이 요소에 없습니다");
		} else {
			System.out.println(search+"은(는) x["+idx+"]에 있습니다.");
		}
	
	}
}
