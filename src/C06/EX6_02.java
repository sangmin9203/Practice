package C06;

import java.util.Scanner;

public class EX6_02 {
	//버블 정렬.v2
	
		static void swap(int [] a, int idx1, int idx2) {
			int imsi = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = imsi;
		}
		
		static void bubbleSort(int [] a, int n) { //배열과 요솟수가 들어감
			int exchage = 0; //패스의 교환 횟수를 기록합니다.
			for(int i = 0; i<n-1; i++) {
				for(int j = n-1; j>i; j--) {
					if(a[j-1] > a[j]) {
						swap(a, j-1, j);
						exchage++;
					}
				
					if(exchage == 0) {
						break; //교환이 이루어지지 않으면 종료합니다.
					}
				} //패스 end
				
			}
		}
		
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("버블 정렬(version 2)");
			System.out.print("요솟수 : ");
			int nx = sc1.nextInt();
			int [] x = new int[nx];
			
			for(int i = 0; i < nx; i++) {
				System.out.print("x["+i+"] : ");
				x[i] = sc1.nextInt();
			}
			
			
			bubbleSort(x, nx); //배열 x를 버블 정렬합니다.
			
			for(int i = 0; i<nx; i++) {
				System.out.println("x["+i+"] = "+x[i]);
			}
			
			
			
		}
}
