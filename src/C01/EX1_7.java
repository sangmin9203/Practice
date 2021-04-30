package C01;

public class EX1_7 {
	
	public static void main(String[] agrs) {
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%3d",i*j); //3d는 유용하다 앞뒤로 칸을 잡아주기 때문에 console 배열이 깔끔함
			}System.out.println();
		}
	}
}
