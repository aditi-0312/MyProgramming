package array.programs;

public class FindMissingNumber {
	
	public static void findMissing(int a[], int n ) {
		
		int i;
		int temp[]=new int[n+1];
		
		for (i = 0; i <= n; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < n; i++) {
            temp[a[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= n; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
		
	public static void main(String[] args) {
		int []a= {1,2,3,5};
		int n=a.length;
		findMissing(a,n);
	}

}
