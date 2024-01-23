package Array;

import java.util.Scanner;

public class TwoD_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][]ar=new int[n][m];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		int x=sc.nextInt();
		int ans=search(ar,x);
		System.out.println(ans);
	}
	public static int search(int ar [][],int x) {
			int r=0;
			int c=ar[0].length-1;
			while(c>=0 && r<=ar[0].length-1) {
				if(ar[r][c]==x) {
					return 1;
				}
				else if(ar[r][c]<x) {
					r++;
				}
				else {
					c--;
				}
			}
			return 0;
	}

}
