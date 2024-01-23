package Array;

import java.util.Scanner;

public class divisible_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        for(int i=0;i<t;i++){
	            int n=sc.nextInt();
	            int ar[]=new int[n];
	            for(int j=0;j<n;j++){
	                ar[j]=sc.nextInt();
	            }
	           
	             System.out.println( div(ar,n));
	        }
	    }
	   public static long div(int ar[],int n) { 
			int sum=0;
			long f[]=new long[ar.length];
			f[0]=1;
			for (int i = 0; i < f.length; i++) {
				sum+=ar[i];
				sum%=n;
				if(sum<0) {
					sum+=n;
				}
				f[sum]=f[sum]+1;
			}
			long ans=0;
			for (int i = 0; i < f.length; i++) {
				if(f[i]>=2) {
					ans=ans+((f[i]*(f[i]-1))/2);
				}
			}
			return ans;
		}

	}

