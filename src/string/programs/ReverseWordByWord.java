package string.programs;

import java.util.Scanner;

public class ReverseWordByWord {

	public static void main(String[] args) {

		ReverseWordByWord rw = new ReverseWordByWord();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Reverse of a String  is : " + rw.reversestr(str)); // called method
	}

	// reverse string method
	static String reversestr(String str) {
		String r = "";
		for (int i = str.length(); i > 0; --i) // execute until condition i>0 becomes false
		{
			r = r + (str.charAt(i - 1));
		}
		return r;
	}

}
