package pattern.programs;

public class Pattern {

	public static void main(String[] args) {
		
		int n=5;
		
		System.out.println("right angled triangle: ");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("next");
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Equilatera triangle/ Hill Pattern:");
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {      //by removing = from condition we're printting one column less
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
