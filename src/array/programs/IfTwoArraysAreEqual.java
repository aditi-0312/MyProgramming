package array.programs;

import java.util.Arrays;

public class IfTwoArraysAreEqual {

    public static boolean check(long A[],long B[],int N) {
    	Arrays.sort(A);
    	Arrays.sort(B);
    	
    	if(Arrays.equals(A, B)) {
    		return true;
    	}else
    		return false;
    }

	public static void main(String[] args) {
		long A[] = {1,2,2,5,4,0};
        long B[] = {2,4,5,0,1,2};
        int N = 5;
        
        System.out.println(check(A,B,N));
	}

}
