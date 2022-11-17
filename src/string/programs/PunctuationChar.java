package string.programs;

import java.util.Scanner;

public class PunctuationChar {
	
	public static void numberOfPunctuations(String str) {
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='!'||str.charAt(i)=='&'||str.charAt(i)=='?'||str.charAt(i)==';'
					||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)=='/'||
					str.charAt(i)=='\"') 
				count++;
		}
		System.out.println("number of punctuations: " + count );
	}
	
	public static void main (String[] args) {
		/*System.out.print("enter the String: ");
		Scanner scn = new Scanner(System.in);
		String str=scn.nextLine();*/
		
		String str="He said, 'The mailman loves you.' I heard it with my own ears";
		
		numberOfPunctuations(str);
	}
}
