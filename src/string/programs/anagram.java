package string.programs;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="brag";
		String str2="grab";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("not anagram");
		}else {
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if(Arrays.equals(s1, s2)==true) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
			
		}

	}

}
