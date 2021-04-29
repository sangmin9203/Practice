package C8;

public class EX8_03KMP {
	
	static int EX8_03KMP(String txt, String pat) {
		int pt = 1;
		int pp = 0;
		int[] skip = new int[pat.length()+1]; //일치했을 경우 건너뛰 표
		
		//KMP 검색법은 앞의 비교했던 부분을 다시 비교하지 않고 건너뛰는 방식
		//건너뛰기 표를 작성
		skip[pt] = 0;
		while(pt != pat.length()) {
			if(pat.charAt(pt) == pat.charAt(pp)) {
				skip[++pt] = ++pp;
			} else if(pp == 0) {
				skip[++pt] = pp;
			} else {
				pp = skip[pp];
			}
		}
		
		//검색
		pt = pp = 0;
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else if(pp == 0) {
				pt++;
			} else {
				pp = skip[pp];
			}
		}
		
		if(pp == pat.length()) {
			return pt-pp;
		} else {
			return -1;
		}
		
	}
}
