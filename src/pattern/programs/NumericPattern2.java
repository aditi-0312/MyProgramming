package pattern.programs;

public class NumericPattern2 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int p = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(p-- + " ");
			}
			System.out.println();
		}

		System.out.println("NEXT");

		for (int i = 1; i <= n; i++) {
			int p=1;
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(p++ + " ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(p-- + " ");
			}
			System.out.println();
		}
	}

}
