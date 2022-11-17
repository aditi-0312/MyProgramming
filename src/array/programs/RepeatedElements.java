package array.programs;

public class RepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Duplicate elements are: ");
		int[] a = { 3, 4, 3, 2, 2, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.println(a[j] + " ");
				}
			}
		}
	}

}
