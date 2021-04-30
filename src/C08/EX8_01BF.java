package C08;

import java.util.Scanner;

public class EX8_01BF {

	static int EX8_01BF(String txt, String pat) {
		int pt = 0; //txt 커서
		int pp = 0; //pat 커서(패턴)
		
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {	//문자를 비교해서 같다면 그다음글자를 비교
				pt++;	
				pp++;
			} else {
				pt = pt-pp +1; //txt의 글자와 패턴의 글자가 다르다면 
				pp = 0;		//txt의 다음 글자로 이동하고 패턴의 첫글자와 비교한다.
			}
		}
		
		if(pp==pat.length()) { //검색 성공
			return pt-pp;
		}
		return -1; //검색 실패
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("텍스트 : "); //텍스트용 문자열
		String s1 = sc1.next();
		
		System.out.print("패턴 : "); //패턴용 문자열
		String s2 = sc1.next();
		
		int idx = EX8_01BF(s1, s2); //검색 성공 : 패턴의 길이, 검색 실패 : -1
		
		if(idx == -1) {
			System.out.println("텍스트에 패턴이 없습니다.");
		} else {
			//일치하는 문자 바로 앞까지의 길이를 구합니다.
			int len = 0;
			for(int i = 0; i < idx; i++) {
				len += s1.substring(i, i+1).getBytes().length;
			}
			
			len += s2.length();
			System.out.println((idx+1)+"번째 문자부터 일치합니다.");
			System.out.println("텍스트 : " +s1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
			
		}
	}
}
