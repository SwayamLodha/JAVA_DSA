package Dynamic_programing;

import java.util.Arrays;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 2, 3, 5, 1, 4 };
		int [][]dp=new int[ar.length][ar.length];
		for(int[] a: dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(max_profit(ar, 0, ar.length - 1, 1, dp));
		System.out.println(max_profit_BU(ar));
	}

	public static int max_profit(int[] ar, int i, int j, int year, int[][]dp) {
		if (i > j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int f = (ar[i] * year) + (max_profit(ar, i + 1, j, year+1, dp));
		int l = (ar[j] * year) + (max_profit(ar, i, j - 1, year+1, dp));
		return Math.max(f, l);
	}
	
	public static int max_profit_BU(int[] ar) {
		int [][]dp=new int[ar.length][ar.length];
		int year = ar.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i]=ar[i]*year;
		}
		year--;
		for (int slide = 1; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i=j-slide;
				int f = (ar[i] * year) + dp[i+1][j];
				int l = (ar[j] * year) + dp[i][j-1];
				dp[i][j]= Math.max(f, l);
			}
			year--;
		}
		
		return dp[0][ar.length-1];
	}
}
