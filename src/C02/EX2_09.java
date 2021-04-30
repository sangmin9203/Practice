package C02;

public class EX2_09 {
	
	public static void main(String[] args) {
		int counter = 0;
		for(int i = 2; i<=1000; i++) {
			 int n;
				for(n = 2; n<i; n++) {
					counter++;
					if(i%n==0)
					break;
				} //for 문을 벗어날때의 값은 소수값 따라서 나온 n과 i가 같으면 그 수는 소수
				if(i==n)
					System.out.println(i);
		}
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
	}
}
