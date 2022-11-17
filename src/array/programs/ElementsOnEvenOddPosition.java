package array.programs;

public class ElementsOnEvenOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4};
		
		System.out.println("elements on even position");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println();
		
		System.out.println("elements on odd position");
		
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
