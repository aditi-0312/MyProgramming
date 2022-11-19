package basic.programs;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter no. : ");
		double a=sc.nextInt();
		
		System.out.print("enter no. : ");
		double b=sc.nextInt();
		
		System.out.print("enter operator: ");
		
		String operation=sc.next();
		
		switch(operation) {
		
		case "+": 
			System.out.println(a+b);
			break;
			
			
		case "-": 
			System.out.println(a-b);
			break;
			
		case "*":
			System.out.println(a*b);
			break;
			
		case "/" :
			System.out.println(a/b);
			break;
			
		default: 
			System.out.println("invalid operator");
		}
	}

}
