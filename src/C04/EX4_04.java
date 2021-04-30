package C04;

import java.util.Scanner;

import C04.EX4_03Queue.EmptyIntQueueExcetion;
import C04.EX4_03Queue.OverflowIntQueueExcetion;

class EX4_04 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		EX4_03Queue s = new EX4_03Queue(64); //최대 64개를 인큐할 수 있는 큐
		
		while(true) {
			System.out.println("현재 데이터 수 : " +s.size()+ " / " + s.capacity());
			System.out.print("(1)인큐    (2)디큐    (3)피크    (4)덤프    (0)종료 : ");
			
			int menu = sc1.nextInt();
			if(menu == 0) {
				break;
			}
			
			int x;
			switch(menu) {
				case 1 :
					System.out.print("데이터 : ");
					x = sc1.nextInt();
					try {
						s.enque(x);
					} catch(OverflowIntQueueExcetion e) {
						System.out.println("큐가 가득 찼습니다.");
					}
					break;
				
				case 2 :
					try {
						x = s.deque();
						System.out.println("디큐한 데이터는 " +x+ "입니다.");
					} catch(EmptyIntQueueExcetion e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
					
				case 3 :
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " +x+ "입니다.");
					} catch (EmptyIntQueueExcetion e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
					
				case 4 :
					s.dump();
					break;
			}
		}
	}
	
}
