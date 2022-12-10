package searching.sorting.programs;

public class LinearSearchString {

	public static void main(String[] args) {
		
		String[] s= {"sue","adi","lane","rory"};
		String key="lp";
		int flag=0;
		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(key)) {
				System.out.println("item present at "+i+ " index position");
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Item not found in the list");
		}
	}

}
