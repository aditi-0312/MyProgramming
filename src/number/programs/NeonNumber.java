package number.programs;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		System.out.print("enter any number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		//double sq=Math.sqrt(num);
		int sq=num*num;
		
		while (sq>0) {
			int digit=sq%10;
			
			sum=sum+digit;
			
			sq=sq/10;
		}
		if(num==sum) {
			System.out.println(num + " is a neon number");
		}else {
			System.out.println(num + " is not a neon number");

		}
	}

}
