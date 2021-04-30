package C03;

import java.util.Scanner;

public class EX3_04 {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr)/2; //중앙 요소의 인덱스
			if(a[pc] == key) {
				return pc; //검색 끝
			} else if(a[pc]<key) {
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			} else {
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 돌림
			}
		} while(pl <= pr);
		
		return -1; // 검색 실패
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = sc1.nextInt();
		int [] x = new int[n];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc1.nextInt();
		
		for(int i = 1; i<n; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc1.nextInt();
			} while(x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.print("검색할 값 : " );
		int key = sc1.nextInt();
		
		int idx = binSearch(x, n, key); // 배열 x에서 키 값이 key인 요소를 검색
		
		if(idx == -1) {
			System.out.println("해당 값의 요소가 없습니다.");
		} else {
			System.out.println(key+"은(는)  x["+idx+"]에 있습니다.");
		}
	}

}
