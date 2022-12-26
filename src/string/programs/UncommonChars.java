package string.programs;

public class UncommonChars {

	// size of hashtable
	static int MAX_CHAR = 26;

	static void findandPrintUncommonChars(String s1, String s2) {
		int[] present = new int[MAX_CHAR];

		// mark presence of each character as 0
		// in the hash table 'present[]'
		for (int i = 0; i < MAX_CHAR; i++) {
			present[i] = 0;
		}

		int l1 = s1.length();
		int l2 = s2.length();

		// for each character of str1, mark its
		// presence as 1 in 'present[]'
		for (int i = 0; i < l1; i++) {
			present[s1.charAt(i) - 'a'] = 1;
		}

		// for each character of str2
		for (int i = 0; i < l2; i++) {

			// if a character of str2 is also present
			// in str1, then mark its presence as -1
			if (present[s2.charAt(i) - 'a'] == 1 || present[s2.charAt(i) - 'a'] == -1) {
				present[s2.charAt(i) - 'a'] = -1;
			}

			// else mark its presence as 2
			else {
				present[s2.charAt(i) - 'a'] = 2;
			}
		}

		// print all the uncommon characters
		for (int i = 0; i < MAX_CHAR; i++) {
			if (present[i] == 1 || present[i] == 2) {
				System.out.print((char) (i + 'a') + " ");
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "characters";
        String s2 = "alphabets";
        findandPrintUncommonChars(s1, s2);
	}

}
