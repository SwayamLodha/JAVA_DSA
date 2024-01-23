package DAA_LAB;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class as1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=genAr(5000);
		Arrays.sort(ar);
		int n=sc.nextInt();
		System.out.println(BS(ar,n));
	}
	public static int[] genAr(int n) {
		int ar[]=new int[n];
		Random r=new Random();
		for(int i=0;i<ar.length;i++) {
			ar[i]=r.nextInt(10000);
		}
		return ar;
	}
	public static boolean BS(int[]ar , int t) {
		int i=0;
		int j=ar.length-1;
		while(i<j) {
			int m=i+(j-i)/2;
			if(ar[m]==t) {
				return true;
			}
			else if(ar[m]<t) {
				i=m+1;
			}
			else {
				j=m-1;
			}
	}
		return false;
}
}
