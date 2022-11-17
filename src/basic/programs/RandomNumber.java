package basic.programs;

public class RandomNumber {

	public static void main(String[] args) {

		double a = Math.random();
		System.out.println(a);

		// between a certain range
		int min = 200;
		int max = 400;

		double b = Math.random() * (max - min + 1) + min;
		System.out.println("Random number between " + min + " and " + max + " is: " + b);

		int c = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("Random number between " + min + " and " + max + " is: " + c);

	}

}
