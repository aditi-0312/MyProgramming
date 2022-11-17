package string.programs;

import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		System.out.print("enter the string: ");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		//String s = "bitch";

		int[] freq = new int[s.length()];
		int i, j;

		char str[] = s.toCharArray();

		for (i = 0; i < s.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < s.length(); j++) {
				if (str[i] == str[j]) {
					freq[i]++;

					str[j] = '0';
				}
			}
		}

		System.out.println("Characters and their corresponding frequencies: ");

		for (i = 0; i < str.length; i++) {
			if (str[i] != ' ' && str[i] != '0') {
				System.out.println(str[i] + "-" + freq[i]);
			}
		}

	}

}
