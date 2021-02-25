package C1;

public class EX1_2 {

	public static void main(String[] args) {
		int result = max3(4,1,1);
		System.out.println(result);
	}
	
	static int max3(int a, int b, int c){
		int max = a;
		if(b>max)
			max = b;
		if(c>max)
			max = c;
		return max;
		
	}
}
