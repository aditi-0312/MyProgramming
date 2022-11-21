package number.programs;

import java.util.Scanner;

public class AltPrimeNum {

	static int checkPrime(int num) {
		int flag = 0;
		for (int i = 2; i < num - 1; i++) {

			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	static void printPrime(int n) {
		int temp = 2;

		for (int i = 1; i <= n - 1; i++) {
			if (checkPrime(i) == 1) {
				if (temp % 2 == 0)
					System.out.print(i + " ");

				temp++;

			}
		}

	}

	public static void main(String[] args) {
		System.out.print("enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print("Alternate Prime numbers upto " + num + " are: ");

		printPrime(num);
	}

}
