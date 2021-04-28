package C6;

import java.util.Scanner;

class EX6_12 {
	
	static int[] buff; //작업용 배열
	
	//a[left] ~ a[right]를 재귀적으로 병합 정렬
	static void mergeSort(int[] a, int left, int right) {
		if(left<right) {
			int i;
			int center = (left+right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			mergeSort(a, left, center); //배열의 앞부분을 병합 정렬합니다.
			mergeSort(a, center+1, right); //배열의 뒷부분을 병합 정렬합니다.
			
			for(i = left; i<= center; i++) { //뒷부분의 center+1 이 left가 된다
				buff[p++] = a[i];
			}
			
			while(i <= right && j < p) {
				a[k++] = (buff[j]<=a[i]) ? buff[j++] : a[i++];
			}
			
			while(j<p) {
				a[k++] = buff[j++];
			}
			
		}
	}
	
	static void mergeSortR(int[] a, int n) {
		buff = new int[n];
		
		mergeSort(a, 0, n-1); //배열 전체를 병합 정렬합니다.
		
		buff = null; //작업용 배열을 해제합니다.
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("병합 정렬");
		System.out.print("요솟수 : ");
		int nx = sc1.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc1.nextInt();
		}
		
		mergeSortR(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}
}
