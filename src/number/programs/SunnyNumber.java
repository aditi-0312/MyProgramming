package number.programs;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		System.out.print("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int num = n + 1;
		double sqrt =  Math.sqrt(num);
		System.out.println(sqrt);

		if (Math.floor(sqrt) == sqrt) {
			System.out.println(n + " is a sunny no.");
		} else
			System.out.println(n + " is not a sunny no.");
	}

}
