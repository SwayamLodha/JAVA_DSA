package Dynamic_programing;

import java.util.Arrays;

public class leetcode_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 5, 2, 1, 11 };
		int[] dp = new int[ar.length];
		Arrays.fill(dp, -1);
		System.out.println(robber(ar, 0, dp));
		System.out.println(robber_BU(ar));
	}

	public static int robber(int ar[], int i, int[] dp) {
		if (i >= ar.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = ar[i] + robber(ar, i + 2, dp);
		int do_not_rob = robber(ar, i + 1, dp);
		dp[i] = Math.max(rob, do_not_rob);
		return Math.max(rob, do_not_rob);
	}

	public static int robber_BU(int ar[]) {
		int dp[] = new int[ar.length];
		dp[0] = ar[0];
		dp[1] = Math.max(ar[0], ar[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = ar[i] + dp[i - 2];
			int do_not_rob = dp[i - 1];
			dp[i] = Math.max(rob, do_not_rob);
		}
		return dp[ar.length - 1];
	}
}
