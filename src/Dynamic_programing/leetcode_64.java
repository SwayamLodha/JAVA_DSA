package Dynamic_programing;

import java.util.Arrays;

public class leetcode_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] x : dp) {
			Arrays.fill(x, -1);
		}
		System.out.println(min_sum(grid, 0, 0, dp));
	}

	public static int min_sum(int ar[][], int i, int j, int[][] dp) {
		if (i == ar.length || j == ar[0].length) {
			return Integer.MAX_VALUE;
		}
		if (i == ar.length - 1 && j == ar[0].length - 1) {
			return ar[i][j];
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ver = min_sum(ar, i + 1, j, dp);
		int hor = min_sum(ar, i, j + 1, dp);
		return dp[i][j] = Math.min(ver, hor) + ar[i][j];
	}
}
