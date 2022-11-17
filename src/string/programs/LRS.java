package string.programs;

import java.util.Scanner;

public class LRS {
	public static int solution(String str) {
		int dp[][] = new int[str.length() + 1][str.length() + 1];

		for (int i = dp.length - 1; i >= 0; i--) {
			for (int j = dp[0].length - 1; j >= 0; j--) {
				dp[i][j] = 0;
				if (i == dp.length - 1&&j==dp[0].length-1) {
					dp[i][j] = 0;
				}else if(i==dp.length-1) {
					dp[i][j]=0;
				}else if(j==dp[0].length-1) {
					dp[i][j]=0;
				}else {
					if(str.charAt(i)==str.charAt(j)&& i!=j) {
						dp[i][j]=dp[i+1][j+1]+1;
					}else {
						dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
					}
				}
					
			}
		}
		return dp[0][0];
	}
	
	public static void main (String[] args) {
		System.out.println("enter the string: ");
		
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(solution(str));
	}
	
}
