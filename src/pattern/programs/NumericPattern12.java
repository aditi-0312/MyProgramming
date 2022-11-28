package pattern.programs;

public class NumericPattern12 {

	public static void main(String[] args) {
		int coe=1;
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				 if (k == 0 || i == 0)  
	                   coe = 1;  
	               else  
	                   coe = coe * (i - k + 1) / k; 
				 System.out.print(coe );
				//System.out.print(" "+ (i-1));
			}
			System.out.println();
		}
	}

}
