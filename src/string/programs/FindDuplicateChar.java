package string.programs;

public class FindDuplicateChar {

	public static void main(String[] args) {
		System.out.println("Duplicate Characters are ");
		String s = "my name is aditi";
		int count = 0;

		char str[] = s.toCharArray();

		for (int i = 0; i < str.length; i++) {
			count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j] && str[i] != ' ') {
					count++;
					str[j] = '0';
				}
			}
			if (count > 1 && str[i] != '0') {
				System.out.println(str[i]);
			}
		}

	}

}
