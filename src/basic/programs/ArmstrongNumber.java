package basic.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("I made a new change");
		int num = sc.nextInt();
		//int num = 123;
		int t1 = num;
		int len = 0;
		while (t1 != 0) {
			len = len + 1;
			t1 = t1 / 10;
		}

		int t2 = num;
		int arm = 0;
		while (t2 != 0) {
			int mul = 1;
			int rem = t2 % 10;
			for (int i = 1; i <= len; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == num) 
		{
			System.out.println(num + " is armstrong number");
		} else 
		{
			System.out.println(num + " is not armstrong number");
		}
	}

}
