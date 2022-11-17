package basic.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number: ");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		
		if(n==0||n==1) {
			System.out.println(n+" is not a prime number ");
		}else {
			for(int i=2;i<n-1;i++) {
				if(n%i==0) {
					System.out.println(n + " is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(n + " is a prime number");
		}
		
	}

}
