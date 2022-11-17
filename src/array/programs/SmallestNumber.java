package array.programs;

public class SmallestNumber {
	
	public static int getSmallest(int []a,int total) {
		int temp=0;
		for(int i=0; i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,5,6,3,2};
		int[] b= {44,66,99,77,33,22,55};
		
		System.out.println("samllest no. is: " +getSmallest(a,6));
		System.out.println("samllest no. is: " +getSmallest(b,7));

	}

}
