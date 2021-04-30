package C02;

public class EX2_03 {
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		
		System.out.print("a = ");
		for(int i = 0; i<a.length; i++) {
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
		int [] b = a.clone();
		b[3] = 0;
		System.out.print("b = ");
		for(int i = 0; i<b.length; i++) {
			System.out.printf("%3d",b[i]);
		}
		
	}
}
