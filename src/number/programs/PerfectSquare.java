package number.programs;

import java.util.Scanner;

public class PerfectSquare {
	/*
	 * static boolean checkPerfectSquare(double number) { double sqrt =
	 * Math.sqrt(number);
	 * 
	 * return ((sqrt-Math.floor(sqrt)) == 0);
	 */
	

	public static void main(String[] args) {
		System.out.print("Enter any number = ");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();

		// boolean result = checkPerfectSquare(number)?true:false;
		// System.out.println("Given number is a perfect square: "+result);
		
		
		//USER DEFINED LOGIC
		if (checkPerfectSquare(number))
			System.out.println("Yes, the given number is perfect square.");
		else
			System.out.print("No, the given number is not perfect square.");
	}

	// user-defined method that checks the number is perfect square or not
	static boolean checkPerfectSquare(double number) {
		for (int i = 1; i * i <= number; i++) {
			// if (i * i = number)
			// comparing conditions using logical AND
			if ((number % i == 0) && (number / i == i)) {
				// returns true if both conditions are true
				return true;
			}
		}
		// returns false if any one condition is false
		return false;
	}

}
