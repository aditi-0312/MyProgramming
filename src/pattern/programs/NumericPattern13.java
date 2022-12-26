package pattern.programs;

public class NumericPattern13 {

	public static void main(String[] args) {
		int n = 6;
		int coe = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(Integer.toString((int) Math.pow(11, i)) + " ");

			}
			System.out.println();
		}
	}
}
