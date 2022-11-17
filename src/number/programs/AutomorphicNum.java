package number.programs;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {

		System.out.print("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int r, d = 0;

		// to count number of digits

		while (n > 0) {
			r = n % 10;
			++d;
			n = n / 10;
		}

			int square = num * num;
			System.out.println(square);

			// int last = square % 100;
			int p = (int) Math.pow(10, d);
			int last = square % p;

			if (last == num) {
				System.out.println(num + " is an automorphic number");
			} else {
				System.out.println(num + " is not an automorphic number");
			}

	
	}
	}

