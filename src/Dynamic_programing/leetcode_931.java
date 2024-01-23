package Dynamic_programing;

import java.util.Arrays;

public class leetcode_931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
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
	
		public static int min_fall_sum(int ar[][], int i, int j, int[][] dp) {
			if (j < 0 || j >= ar[0].length) {
				return Integer.MAX_VALUE;
			}
			if (i == ar.length - 1 ) {
				return ar[i][j];
			}
			if (dp[i][j] != -1) {
				return dp[i][j];
			}
			
			int dig_l = min_fall_sum(ar, i + 1, j - 1, dp);
			
			int ver_d = min_fall_sum(ar, i + 1, j, dp);
			
			int dig_r = min_fall_sum(ar, i + 1, j + 1, dp);
			return dp[i][j] = Math.min(ver_d, Math.min(dig_l, dig_r)) + ar[i][j];
		}
	}
