package C1;

import java.util.Scanner;

public class EX1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
		System.out.println("c의 값 : "+c);
		int max = a;
		if(b>max) 
			max = b;
		if(c>max)
			max = c;
		
		System.out.println("최댓값은 "+max+"입니다.");
	}

}
