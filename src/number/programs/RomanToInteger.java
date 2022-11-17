package number.programs;

public class RomanToInteger {

	// Finds decimal value of a given roman numeral
	static int value(char r) {
		if (r == 'I') {
			return 1;
		}
		if (r == 'V') {
			return 5;
		}
		if (r == 'X') {
			return 10;
		}
		if (r == 'L') {
			return 50;
		}
		if (r == 'C') {
			return 100;
		}
		if (r == 'D') {
			return 500;
		}
		if (r == 'M') {
			return 1000;

			// return -1;
		}
		return -1;
	}

	public static int romanToDecimal(String str) {

		int total = 0;

		for (int i = 0; i < str.length(); i++) {

			int s1 = value(str.charAt(i));
			// getting value of symbol s2[i+1]
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));
				// comparing the current character from its right character
				if (s1 >= s2) {
					// if the value of current character is greater or equal to the next symbol
					total = total + s1;
				} else {
					// if the value of the current character is less than the next symbol
					total = total - s1;
				}
			} else {
				total = total + s1;
			}
		}
		// returns corresponding integer value
		return total;
	}

	public static void main(String[] args) {
		String str = "XXIV";
		System.out.println(romanToDecimal(str));
	}
}
