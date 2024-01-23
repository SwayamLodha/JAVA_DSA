package Dynamic_programing;

import java.util.Arrays;

public class leetcode_1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abdce";
		String t = "ace";
		  int [][] dp=new int[t.length()][s.length()];
			for(int []a: dp) {
				Arrays.fill(a, -1);
			}
			System.out.println(LCS(s, t, 0, 0, dp));
			System.out.println(LCS_BU(s, t));
	}
	// text1 --> s , j
	// text2 --> t , i
		
	public static int LCS(String s, String t, int i, int j, int[][]dp) {
		
		 if(i==t.length() || j==s.length()) {
			 return 0;
		 }
	
		 if(dp[i][j]!=-1) {
			 return dp[i][j];
		 }
		 int ans=0;
		 if(s.charAt(j)==t.charAt(i)) {
			 ans =1+LCS(s, t, i+1,j+1, dp);
		 }
		 else {
			 int fs =LCS(s, t, i+1, j, dp);
		     int ss =LCS(s, t, i , j+1 , dp);
		     ans=Math.max(fs, ss);
		 }
		 return dp[i][j]=ans;
	}
			
	
	public static int LCS_BU(String s, String t) {
		int [][] dp=new int[s.length()+1][t.length()+1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans=0;
				if(s.charAt(i-1) == t.charAt(j-1)) {
					ans= 1 + dp[i-1][j-1];
				}
				else {
					int fs=dp[i-1][j];
					int ss=dp[i][j-1];
					ans = Math.max(fs, ss);
				}
					dp[i][j]=ans;
			}
		}
				return dp[s.length()][t.length()];
	}
	
}

