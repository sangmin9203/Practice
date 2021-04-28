package C4;

import java.util.Scanner;

import C4.EX4_01Stack.EmptyIntStackException;
import C4.EX4_01Stack.OverflowIntStackException;

class EX4_02 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		EX4_01Stack s = new EX4_01Stack(64); //최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수 : " +s.size()+ " / "+s.capacity());
			
			System.out.print("(1)푸쉬    (2)팝    (3)피크    (4)덤프    (0)종료 : ");
			int menu = sc1.nextInt();
			
			if(menu==0) {
				break;
			}
			
			int x;
			switch(menu) {
				case 1 : //푸쉬
					System.out.print("데이터 : ");
					x = sc1.nextInt();
					try {
					s.push(x);
					} catch(OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				
				case 2 : //팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 "+x+"입니다.");
					} catch(EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				
				case 3 :  //피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " +x+ "입니다.");
					} catch(EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 4 : //덤프
					s.dump();
					break;
					
			}
		}
	}
}
