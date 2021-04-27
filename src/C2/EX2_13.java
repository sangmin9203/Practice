package C2;

import java.util.Scanner;

public class EX2_13 {

	static int [][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //윤년
	};
	
	static int yYP(int year) { //평년 윤년
		return(year%4 == 0 && year%100 !=0 || year% 400 ==0) ? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i = 1; i<m; i++) {
			days += mdays[yYP(y)][i-1]; //평년이면 0, 윤년이면 1
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : ");
			int year = sc1.nextInt();
			System.out.print("월 : ");
			int month = sc1.nextInt();
			System.out.print("일 : ");
			int day = sc1.nextInt();
			
			System.out.printf("그 해 %d일때 입니다.\n", dayOfYear(year, month, day));
			
			System.out.println("한번 더 할까요?(1.예/0.아니오) : ");
			retry = sc1.nextInt();
		} while(retry==1);
	}
}
