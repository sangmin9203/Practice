package C5;

import java.util.Scanner;

import C4.EX4_01Stack;

public class EX5_05 {
	
	//스택을 이용한 재귀함수
	static void recur(int n) {
		EX4_01Stack s = new EX4_01Stack(n);
		
		while(true) {
			if(n>0) {
				s.push(n); //n의 값을 푸쉬
				n = n-1;
				continue;
			}
			if(s.isEmpty() != true) { //스택이 비어있지 않다면
				n = s.pop(); //저장하고 있던 스택의 값을 꺼냄
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc1.nextInt();
		
		recur(n);
	}
}
