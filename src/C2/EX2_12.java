package C2;

public class EX2_12 {

	public static void main(String[] args) {
	
		int[][] arr = new int[2][4];
		
		arr[0][1] = 37;
		arr[0][3] = 54;
		arr[1][2] = 65;
		
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("arr["+i+"]["+j+"] = "+ arr[i][j]);
			}
		}
	
	}
}
