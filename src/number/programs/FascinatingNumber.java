package number.programs;

import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int n1 = 0, n2, digit = 0, r=0;
		int num=n;

		while (num > 0) {
			//int num=n;
			r = num % 10;
			++digit;
			num = num / 10;
		}

		if (digit < 3) {
			System.out.println(n + " is not a fascinating number");
		} else
			n1 = n * 2;
		n2 = n * 3;
		String str = n + "" + n1 + n2;
		System.out.println(str);

		int flag = 1;
		for (char c = '1'; c <= '9'; c++) {
			int freq = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (c == ch) {
					freq++;
				}
			}
			if (freq != 1) {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			System.out.println(n + " is a fascinating num");
		} else {
			System.out.println(n + " is not a fascinating num");

		}

	}

}
