package pattern.programs;

public class NumericPattern4 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 5; i++) {
			// for odd row
			if (i % 2 != 0) {
				for (int j = 1; j <= 3; j++) {
					count = count + 1;
					System.out.print(count + " ");
				}
				// for even row
			} else {

				int temp = count + 1;
				for (int j = count + 3; j >= temp; j--) {
					count = count + 1;
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("NEXT");
		
		for (int i = 0; i <= 4; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= 9; j++) {
					System.out.print("0");
				}
			} else {
				for (int k = 1; k <= 9; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
