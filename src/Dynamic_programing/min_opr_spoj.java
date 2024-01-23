package Dynamic_programing;

import java.util.Arrays;
import java.util.Iterator;

public class min_opr_spoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a="FOOD";
			String b="MONKEY";
			int [][]dp=new int[a.length()][b.length()];
			for(int [] ar:dp) {
				Arrays.fill(ar, -1);
			}
			System.out.println(operations(a, b, 0, 0, dp));
			System.out.println(operations_BU(a, b));
	}
		
	
	public static int operations(String a, String b, int i, int j, int[][]dp) {
		
		 if(i==a.length()) {
			 return b.length()-j;
		 }
		 
		 if(j==b.length()) {
			 return a.length()-i;
		 }
		 
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int ans=0;
		
		 if(a.charAt(i)==b.charAt(j)) {
			 ans = operations(a, b, i+1,j+1, dp);
		 }
		 else {
			 int d=operations(a, b, i+1, j, dp);
			 int in=operations(a, b, i, j+1, dp);
			 int r=operations(a, b, i+1, j+1, dp);
			 ans= 1+Math.min(d,Math.min(in, r));
		 }
		 return dp[i][j]=ans;
		 
	}
	
	public static int operations_BU(String a, String b) {
		int dp[][]=new int[a.length()+1][b.length()+1];
	
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]=i;
		}
		for (int i = 0; i < dp.length; i++) {
			dp[i][0]=i;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans=0;
				 if(a.charAt(i-1)==b.charAt(j-1)) {
					 ans = dp[i-1][j-1];
				 }
				 else {
					 int d=dp[i-1][j];
					 int in=dp[i][j-1];
					 int r=dp[i-1][j-1];
					 ans= 1+Math.min(d,Math.min(in, r));
				 }
				 dp[i][j]=ans;
			}
			
		}
		 return dp[a.length()][b.length()];
		
		
		
		 
	}
}
