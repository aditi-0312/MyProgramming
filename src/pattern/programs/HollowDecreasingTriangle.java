package pattern.programs;

import java.util.Scanner;

public class HollowDecreasingTriangle {

	public static void main(String[] args) {
		System.out.print("Enter the size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if (i == 1 || j == i ||  j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
