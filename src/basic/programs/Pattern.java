package basic.programs;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("right angled triangle: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("next");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Right angled triangle:");
		
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
