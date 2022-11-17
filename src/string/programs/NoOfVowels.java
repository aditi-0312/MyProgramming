package string.programs;

public class NoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my name is aditi";
		int countV=0;
		int countC=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o'||str.charAt(i)=='u') {
				countV++;
			}/*else {
				countC++;
			}*/
			
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				countC++;
			}
		}
		System.out.println(countV);
		System.out.println(countC);
	}

}
