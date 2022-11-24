package number.programs;

import java.util.Scanner;

public class SmallestUsingTernaryOp {

	public static void main(String[] args) {
		int a,b,c,smallest,temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number = ");
		a=sc.nextInt();
		
		System.out.print("Enter second number = ");
		b=sc.nextInt();
		
		System.out.print("Enter third number = ");
		c=sc.nextInt();
		
		//Ternary operator : variable_name = (expression) ? value if true:value if false 
		//temp=a<b?a:b;
		
		//smallest=c<temp?c:temp;
		smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);  

		
		System.out.println("The smallest number is = " + smallest);
	}

}
