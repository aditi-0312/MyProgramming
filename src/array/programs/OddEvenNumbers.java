package array.programs;

public class OddEvenNumbers {
	public static void main (String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int j=0,k=0;
		int[] EvenArr=new int[10];
		int[] OddArr=new int[10];

		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				EvenArr[j++]=arr[i];
			}else {
				OddArr[k++]=arr[i];
			}
		}
		
		for(int l=0;l<j;l++) {
		System.out.print(EvenArr[l] + " ");
		}
		
		System.out.println();
		
		for(int l=0;l<j;l++) {
			System.out.print(OddArr[l] + " ");
			}
	}
}
