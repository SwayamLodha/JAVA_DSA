package Dynamic_programing;

import java.util.Arrays;

public class leetcode_1458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = { 2, 1, -2, 5 }, n2 = { 3, 0, -6 };
		System.out.println(product(n1, n2));

	}

	public static int product(int[] n1, int[] n2) {
		int dp[][] = new int[n1.length][n2.length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				int max = n1[i] * n2[j];
				if (i > 0 && j > 0) {
					max = Math.max(max, max + dp[i - 1][j - 1]);
				}
				if (i > 0) {
					max = Math.max(max, dp[i - 1][j]);
				}
				if (j > 0) {
					max = Math.max(max, dp[i][j - 1]);
				}
				dp[i][j] = max;
			}
		}
		return dp[n1.length - 1][n2.length - 1];
	}

}
