package pattern.programs;

public class NumericPattern3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("NEXT");

		for (int i = 1; i <= 5; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 5 - j;
			}
			System.out.println();
		}
	}

}
