package Array;

import java.util.Scanner;

public class leetcode_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		int sum=check(ar);
		System.out.println(sum);
	}
		public static int check(int []ar) {
			int n=ar.length;
			int r[]=new int[n];
			int l[]=new int[n];
			l[0]=ar[0];
			for (int i = 1; i < l.length; i++) {
				l[i]=Math.max(l[i-1], ar[i]);
			}
			r[n-1]=ar[n-1];
			for (int j =  l.length-2; j >=0; j--) {
				r[j]=Math.max(r[j+1], ar[j]);
			}
			int sum=0;
			for (int x = 0; x < l.length; x++) {
				sum+=(Math.min(r[x],l[x])-ar[x]);
			}
			return sum;
		}
}
