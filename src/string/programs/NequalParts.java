package string.programs;

public class NequalParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbcc";
		int temp=0;
		int n=3;
		int chars=s.length()/n;
		
		String[] str=new String[n];
		
		if(s.length()%n!=0) {
			System.out.println("String" + s + "cannot be divided..");
		}else {
			for(int i=0;i<s.length();i=i+chars) {
				String part=s.substring(i, i+chars);
				str[temp]=part;
				temp++;
			}
		}
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
