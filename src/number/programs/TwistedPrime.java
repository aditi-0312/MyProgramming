package number.programs;

import java.util.Scanner;

public class TwistedPrime {

	public static void main(String[] args) {
		System.out.print("enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int rev = 0, n = num;

		if (n % 2 == 0) {
			System.out.println(num + " is not an emirp number");
			System.exit(0);
		} else {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;

			if (r % 2 != 0) {
				System.out.println(num + " is an emirp number");
			} else {
				System.out.println(num + " is not an emirp number");
			}
		}
	
	}

}
