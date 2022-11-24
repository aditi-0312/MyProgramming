package number.programs;
import java.util.Scanner;

public class SwapUsingBitwiseOp {
	
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the first no. = ");
		a = sc.nextInt();

		System.out.print
		("enter the second no. = ");
		b = sc.nextInt();

		System.out.println("before swapping");
		System.out.println("a = " + a + " b = " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping");
		System.out.println("a = " + a + " b = " + b);

	}

}
