package string.programs;

import java.util.Scanner;

public class ReverseAsentence {

	public static void main(String[] args) {
		System.out.print("Enter a sentence: ");
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();

		sen = sen + " ";
		String revsen = "", word = "";
		for (int i = 0; i < sen.length(); i++) {
			char ch = sen.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				revsen = word + " " + revsen;
				word = "";

			}
			
		}
		System.out.println(revsen + " ");
	}

}
