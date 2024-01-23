package Dynamic_programing;

import java.util.Arrays;

public class leetcode_1289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] x : dp) {
			Arrays.fill(x, -1);
		}
		int ans=Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans=Math.min(ans, min_fall_sum(grid, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int min_fall_sum(int ar[][], int row, int col, int[][] dp) {
		if (col < 0 || col >= ar[0].length) {
			return Integer.MAX_VALUE;
		}
		if (row == ar.length - 1 ) {
			return ar[row][col];
		}
		if (dp[row][col] != -1) {
			return dp[row][col];
		}
		int cost = Integer.MAX_VALUE;
		for (int i = 0; i < ar[0].length; i++) {
			if(i != col) {
		
			cost = Math.min(cost, min_fall_sum(ar, row+1, i, dp));
			
		   }
		}	
		return dp[row][col] = ar[row][col] +cost;
	}
}
