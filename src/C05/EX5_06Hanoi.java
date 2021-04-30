package C05;

import java.util.Scanner;

class EX5_06Hanoi {
	
	static void move(int no, int x, int y) { //no = 원반의 갯수, x = 시작 지점, y = 목표지점
		if(no > 1) {
			move(no-1, x, 6-x-y); //중간 기둥이 6-x-y 이다.
		}
		
		System.out.println("원반["+no+"]을"+x+ "기둥에서"+y+"기둥으로 옮김");
		
		if(no > 1) {
			move(no-1, 6-x-y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = sc1.nextInt();
		
		move(n, 1, 3); //1번 기둥의 n개의 원반을 3번 기둥으로 옮김
	}
}
