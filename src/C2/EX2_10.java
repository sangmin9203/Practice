package C2;

public class EX2_10 {
	
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0; //찾은 소수의 갯수
		int [] prime = new int[500];
		
		prime[ptr++] = 2; //prime[0] 에 2를 대입한다. 4이상의 모든 짝수는 소수가 아니므로 priem[0]으로 나누어 떨어지는 수는 배제
		
		//따라서 i는 홀수만 체크하면 된다 ==> i += 2 인 이유
		for(int i =3; i <=1000; i +=2) {
			int n;
			
			for(n = 1; n<ptr; n++) {
				counter++; //나눗셈을 수행한 횟수
				
				if(i%prime[n] == 0) { //배열 prime(소수들의 집합)으로 나누어 떨어진다면 소수가 아니다
					break;
					}
				} //나누기 for-end
			if(n==ptr) {
				prime[ptr++] = i;
			}
		} //전체 for - end
		
		for(int i = 0; i<ptr; i++) { //나온 소수들을 출력
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 실행한 횟수 : "+counter);
		
	}
}
