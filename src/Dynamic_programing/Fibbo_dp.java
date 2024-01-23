package Dynamic_programing;

public class Fibbo_dp {
	public static void main(String[] args) {
		int n=45;
		int []dp=new int[n+1];
		System.out.println(fibo_TD(n, dp));
		n=37;
		System.out.println(fibo_BU(n));
	}

	public static int fibo_TD(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}

		int fn1 = fibo_TD(n - 1, dp);// n-1th
		int fn2 = fibo_TD(n - 2, dp);// n-2th

		dp[n] = fn1 + fn2;
		return fn1 + fn2;

	}
	
	public static int fibo_BU(int n) {
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for (int i = 2; i < dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

}
