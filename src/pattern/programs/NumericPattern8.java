package pattern.programs;

public class NumericPattern8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 8; j++) {
				//System.out.print(j);
				 if(j<=(8-i))  
			            System.out.print(j);  
			            else  
			            System.out.print("*"); 
			}
			//System.out.println();
			
			/*for(int k=4;k>=1;k--) {
				System.out.print(k);
			}*/
			System.out.println();
		}
		
	}

}
