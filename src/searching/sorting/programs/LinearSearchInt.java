package searching.sorting.programs;

public class LinearSearchInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6};
		int key=9;
		int flag=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("item is present at " +i+" index position");
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Item not found in the list");
		}
		
	}

}
