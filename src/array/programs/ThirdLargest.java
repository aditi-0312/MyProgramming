package array.programs;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {7,8,9,3,4,0};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("third largest number is: " + arr[2]);
		System.out.println("second largest number is: " + arr[1]);
	}

}
