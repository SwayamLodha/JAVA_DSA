package Dynamic_programing;

import java.util.Arrays;

public class leetcode_300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {10,9,2,5,3,7,101,18};
		System.out.println(lis(ar));
 	}
	
	public static int lis(int[]ar) {
		int []dp=new int[ar.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < i; j++) {
				if(ar[j]<ar[i]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int ans=1;
		for (int i = 0; i < dp.length; i++) {
			if(dp[i]>ans) {
				ans=dp[i];
				
			}
		}
		return ans;
	}

}
