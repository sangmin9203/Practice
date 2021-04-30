package C02;

import java.util.Random;
import java.util.Scanner;

public class EX2_05 {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in); 
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람의 수 : ");
		int n = sc1.nextInt();
		int [] a = new int[n];
		
		Random random = new Random(); //난수를 사용하기 위한 random 메소드
		for(int i = 0; i<a.length; i++) {
			System.out.print("height["+i+"] : ");
			a[i] = 100 + random.nextInt(90); //난수로 요솟값을 결정한다.
								//nextInt(n) 값이 반환하는 것은 0부터 n-1까지의 정수이다.
			System.out.println(a[i]);
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
