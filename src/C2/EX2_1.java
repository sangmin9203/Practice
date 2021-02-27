package C2;

public class EX2_1 {
	
	public static void main(String[] args) {
		int [] a = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
/*		int [] a = new int[5] {1,2,3,4,5}; 로도 표현 가능 */		
		for(int i = 0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
}
