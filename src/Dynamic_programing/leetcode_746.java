package Dynamic_programing;

import java.util.Arrays;

public class leetcode_746 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {1,100,1,1,1,100,1,1,100,1};
		int dp[]=new int[ar.length];
		Arrays.fill(dp, -1);
		System.out.println(Math.min(mincost(ar,0,dp) , (mincost(ar,1,dp))));
		System.out.println(Math.min(mincost_BU(ar) , (mincost_BU(ar))));

	}
		
	public static int mincost(int ar[],int i, int dp[]) {
		if(i>=ar.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int first=mincost(ar, i+1, dp);
		int second=mincost(ar, i+2, dp);
		return dp[i] = Math.min(first, second)+ar[i];
	}
	
	public static int mincost_BU(int ar[]) {
		int dp[]=new int[ar.length];
		dp[0]=ar[0];
		dp[1]=ar[1];
		
		for (int i = 2; i < dp.length; i++) {
			int first=dp[i-1];
			int second=dp[i-2];
			dp[i] = Math.min(first, second)+ar[i];
		}

		return Math.min(dp[ar.length-1], dp[ar.length-2]);
	}
	
}
