package string.programs;

public class OneStringRotationOfAnother {

	public static void main(String[] args) {

		String s = "abcde";
		String s1 = "delbc";

		if (s.length() != s1.length()) {
			System.out.println("not a rotation");
		} else
			s = s.concat(s);
		if (s.indexOf(s1) != -1) {
			System.out.println("A rotation");
		} else
			System.out.println("not a rotation");

	}
}