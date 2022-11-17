package searching.sorting.programs;

public class BubbleSortString {
	
	public static void main(String [] args) {
		String[] s= {"sue","adi","kim"};
		String temp;
		
		for(int i=0;i<s.length;i++) {
			int flag=0;
			for(int j=0;j<s.length-1-i;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
					
					flag=1;
					
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+" ");
		}
	}
}
