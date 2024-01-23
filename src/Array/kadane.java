package Array;

import java.util.Scanner;

public class kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
			for (int i = 0; i < ar.length; i++) {
				ar[i]=sc.nextInt();
			}
			int ans=kadane(ar);
			System.out.println(ans);
	}
	public static int kadane(int ar[]) {
		int ans=Integer.MIN_VALUE;
		int presum=0;
		for (int i = 0; i < ar.length; i++) {
			presum+=ar[i];
			ans=Math.max(ans,presum);
			if(presum<0) {
				presum=0;
			}
		}
		return ans;
	}

}
