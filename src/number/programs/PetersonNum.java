package number.programs;

import java.util.Scanner;

public class PetersonNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (isPeterson(num)) {
			System.out.println(num + " is a peterson number");
		} else {
			System.out.println(num + " is not a peterson number");
		}

	}

	static boolean isPeterson(int num) {
		int n = num;
		int sum = 0;

		while (n > 0) {
			
			int digit = n % 10 ;
			sum = sum + fact(digit);
			n = n / 10;
		}

		return (sum == num);
	}

	static int fact(int n) {
		if (n == 1) 
			return 1;
		 else {
			int f;
			f = n * fact(n - 1);

			return f;
		}
	}

}
