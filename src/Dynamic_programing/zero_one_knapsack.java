package Dynamic_programing;

import java.util.Arrays;

public class zero_one_knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 8;
		int wt[] = { 1, 4, 2, 3, 6 };
		int val[] = { 1, 1, 7, 9, 1 };
		int[][]dp=new int[cap+1][wt.length];
		for(int[] a:dp) {
			Arrays.fill(a, -1);
		}
		for (int i = 0; i < dp.length; i++) {
			
		}
		System.out.println(knapsack(wt, val, cap, 0,dp));
		System.out.println(knapsack_BU(wt, val, cap));
	}

	public static int knapsack(int wt[], int val[], int cap, int i, int[][]dp) {
		if(cap==0 || i==wt.length) {
			return 0;
		}
		if(dp[cap][i]!=-1) {
			return dp[cap][i];
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + knapsack(wt, val, cap - wt[i], i + 1, dp);
		}
		exc = knapsack(wt, val, cap, i + 1, dp);
		return dp[cap][i]= Math.max(inc, exc);
	}
	
	public static int knapsack_BU(int wt[], int val[], int cap) {
		int[][]dp=new int[cap+1][wt.length+1];
		for (int c = 1; c < dp.length; c++) {
			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0;
				int exc = 0;
				if (c >= wt[i-1]) {
					inc = val[i-1] + dp[c-wt[i-1]][i-1];
				}
				exc = dp[c][i-1];
				dp[c][i]= Math.max(inc, exc);
			}
		}
			return dp[cap][wt.length];
		
	}
}
