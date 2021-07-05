package BooleanCheckArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


		/*	배열을 Boolean 배열로 하고 해당 인덱스를 true/false 로 나누어 카운팅하는 방식으로 
		 	이것을 활용해서 경력사항 계산에 추가해도 될 듯 */
public class BooleanCount {

		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		static StringBuilder sb = new StringBuilder();
	
	
		public static void main(String[] args) throws IOException {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine()); //단어 갯수
			
			for(int i = 0; i<N; i++) {
				if(check()==true) {
					cnt++;
				}
			}
			
			sb.append(cnt);
			System.out.println(sb);
		}
	
		static boolean check() throws IOException {
			boolean[] check = new boolean[26];
			int prev = 0; // 앞선 문자와 연속되는지??
			String str = br.readLine();
			
			for(int i = 0; i<str.length(); i++) {
				//prev 의 문자와 해당 문자가 같다면 중복된 문자인지 여부를 검사하지 않고
				//prev 의 문자와 해당 문자가 다르다면 중복된 문자인지 여부를 검사한다.
				int now = str.charAt(i); //i번째 문자 저장
				
				if(prev != now) {
					if(check[now-'a'] == false) {
						check[now-'a'] =true;
						prev = now;
					} else {
						return false;
					}
				} else {
					continue;
				}
			}
			return true;
		}
}

