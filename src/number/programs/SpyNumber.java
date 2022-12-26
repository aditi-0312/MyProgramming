package number.programs;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		System.out.print("enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		int product=1;

		while (n != 0) {

			int d = n % 10;
			sum = sum + d;
			product=product*d;
			n = n / 10;
		}
		
		
		if(sum==product) {
			System.out.println("given number is spy number ");
		} else  {
			System.out.println("given number is not spy number ");

		}
		
		
	}

}
