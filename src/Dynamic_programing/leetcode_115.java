package Dynamic_programing;

import java.util.Arrays;

public class leetcode_115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		  int [][] dp=new int[t.length()+1][s.length()+1];
			for(int []a: dp) {
				Arrays.fill(a, -1);
			}
			System.out.println(CoinChange(s, t, 0, 0, dp));
	}
	// coin --> s , j
	// amt --> t , i
		
	public static int CoinChange(String s, String t, int i, int j, int[][]dp) {
		
		 if(i==t.length()) {
			 return 1;
		 }
		 if(j==s.length()) {
			 return 0;
		 }
		 if(dp[i][j]!=-1) {
			 return dp[i][j];
		 }
		 int inc = 0;
		 int exc= 0 ;
		 if(s.charAt(j)==t.charAt(i)) {
			 inc =CoinChange(s, t, i+1,j+1, dp);
		 }
		 exc =CoinChange(s, t, i , j+1 , dp);
		 return dp[i][j]=inc+exc;
	}
		
	
}

