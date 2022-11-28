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

		int lines = 4;
		int i, j;
		for (i = 1; i <= lines; i++) {// this loop is used to print lines
			for (j = 1; j <= lines; j++) {// this loop is used to print * in a line
				if (i == j)
					System.out.print("*");
				else
					System.out.print("0");
			}
			j--;
			System.out.print("*");
			while (j >= 1) {// this loop is used to print * in a line
				if (i == j)
					System.out.print("*");
				else
					System.out.print("0");
				j--;
			}
			System.out.println("");
		}
	}

}
