package string.programs;

import java.util.HashSet;

public class FirstRepChar {
	
	static char firstRepeating(char str[]) {
		HashSet<Character> h = new HashSet<>();
		
		for(int i=0;i<str.length-1;i++) {
			char c=str[i];
			if(h.contains(c)) {
				return c;
			}else
				h.add(c);
		}
		return '0';
	}
	public static void main(String[] args) {
		String s="geeks for geeks";
		char str[]=s.toCharArray();
		
		System.out.println(firstRepeating(str));

	}

}
