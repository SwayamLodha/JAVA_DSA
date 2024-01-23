package Dynamic_programing;

public class leetcode_1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n1 = {1,4,2};
		int [] n2 = {1,2,4};
		System.out.println(UL(n1, n2));
	}
	
	public static int UL( int []n1, int n2[]) {
		int dp[][]=new int[n1.length+1][n2.length+1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans=0;
				if(n1[i-1]==n2[j-1]) {
					ans=1+dp[i-1][j-1];
				}
				else {
					int fs=dp[i-1][j];
					int ss=dp[i][j-1];
					ans=Math.max(fs, ss);
				}
				dp[i][j]=ans;
			}
		}
			return dp[n1.length][n2.length];
	}
}
