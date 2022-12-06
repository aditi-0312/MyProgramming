package pattern.programs;

public class Pattern5 {
	public static void main(String[] args) {

System.out.println("Equilatera triangle/ Hill Pattern:");
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {      //by removing = from condition we're printing one column less
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
