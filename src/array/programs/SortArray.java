package array.programs;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		
		Arrays.sort(arr);
		
		//	Array sorted in ascending order
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
