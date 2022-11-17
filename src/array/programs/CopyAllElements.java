package array.programs;

public class CopyAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		
		int[] arr2=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		
		System.out.println("elements of orirginal array");

		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("elements of copied array");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
