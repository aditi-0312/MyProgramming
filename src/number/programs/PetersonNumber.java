package number.programs;

import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (isPeterson(n)) {
			System.out.println(n + " is a peterson number");
		} else {
			System.out.println(n + " is not a peterson number");
		}
	}

	static boolean isPeterson(int n) {
		int num = n;
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum = sum + fact(digit);
			n = n / 10;
		}
		return (sum == num);
	}

	static int fact(int n) {
		if (n == 1)
			return 1;
		else {
			int z;
			z = n * fact(n - 1);
			return z;
		}
	}

}
