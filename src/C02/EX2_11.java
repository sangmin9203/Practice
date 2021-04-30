package C02;

public class EX2_11 {

	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int [] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int i = 5; i<=1000; i+=2) { //홀수 대상, 4이상의 짝수는 소수가 아니다
			boolean flag = false;
			
			for(int a = 1; prime[a]*prime[a]<=i; a++) {
				counter += 2; //카운터가 2가 증가하는 이유는 제곱근을 계산하기 위한 곱셈과 밑에 나머지를 구하기 위한 나눗셈을 합친 값이기 때문이다
								// 만일 제곱근이 i보다 커서 바로 밑의 if문을 타는 경우에는
				
				if(i%prime[a] == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = i;
				counter++; //제곱근을 계산한 곱셈의 횟수가 측정되지 않기 때문에 카운터를 1 증가시켜주는 것이다.
			}
		}
		
		for(int i = 0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : "+counter); //따라서 총 횟수는 3774 처음 78022 보다는 연산횟수가 줄어든것을 확인할 수 있다.
	}
}
