package pattern.programs;

public class NumericPattern1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print(j);
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("NEXT");

		int count = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {

				count = count + 1;
				System.out.print(count + " ");
			}
			System.out.println();
		}

	}

}
