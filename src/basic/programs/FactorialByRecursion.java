package basic.programs;

import java.util.Scanner;

public class FactorialByRecursion {

	static int fact = 1;

	public static void main(String[] args) {
		System.out.print("enter the number: ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		FactorialByRecursion fc = new FactorialByRecursion();
		fc.calcFact(num);
		System.out.println("factorial of " + num + " is " + fact);
	}

	void calcFact(int num) {
		if (num > 1) {
			fact = fact * num;
			calcFact(num - 1);
		}
	}

}
