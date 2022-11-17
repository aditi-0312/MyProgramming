package string.programs;

import java.util.Scanner;

public class NumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the string: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		//String str="aditi";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
			count++;
			}
		}
		System.out.println("number of characters in the string: " + count);
	}

}
