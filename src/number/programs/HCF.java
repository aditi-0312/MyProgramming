package number.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		List<Integer> fx = new ArrayList<>();
		List<Integer> fy = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the first no. = ");
		int x = sc.nextInt();

		System.out.print("enter the first no. = ");
		int y = sc.nextInt();

		int factorNumx = 1;
		while (factorNumx <= x) {
			if (x % factorNumx == 0) {
				fx.add(factorNumx);
			}
			factorNumx++;
		}
		System.out.println(fx);

		int factorNumy = 1;
		while (factorNumy <= y) {
			if (y % factorNumy == 0) {
				fy.add(factorNumy);
			}
			factorNumy++;
		}
		System.out.println(fy);

		fy.retainAll(fx);
		System.out.println("Common elements: " + fy);
		
		System.out.println("HCF is = " + Collections.max(fy));
	}
}
