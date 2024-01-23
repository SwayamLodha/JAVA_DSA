package Dynamic_programing;

import java.util.Arrays;

public class leetcode_518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amt = 5;
		int [][] dp=new int[amt+1][coin.length+1];
		for(int []a: dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(CoinChange(coin, amt, 0, dp));
		System.out.println(CoinChange_BU(coin, amt));
	}

	public static int CoinChange(int [] coin, int amt, int i, int[][]dp) {
	
		 if(amt==0) {
			 return 1;
		 }
		 if(i==coin.length) {
			 return 0;
		 }
		 if(dp[amt][i]!=-1) {
			 return dp[amt][i];
		 }
		 int inc = 0;
		 int exc= 0 ;
		 if(amt>=coin[i]) {
			 inc =CoinChange(coin, amt-coin[i], i, dp);
		 }
		 exc =CoinChange(coin, amt, i+1, dp);
		 return dp[amt][i]=inc+exc;
	}
		
	public static int CoinChange_BU(int [] coin, int amt) {
		int [][] dp=new int[amt+1][coin.length+1];
		for(int i=0 ; i<dp[0].length;i++) {
			dp[0][i]=1;
		}
		for(int am=1;am<dp.length;am++) {
			for (int i = 1; i < dp[0].length; i++) {
				int inc=0;
				int exc=0;
				if(am>=coin[i-1]) {
					inc= dp[am-coin[i-1]][i];
				}
				exc=dp[am][i-1];
				dp[am][i]=inc+exc;
				
			}
		}
			return dp[amt][coin.length];
	}
}
