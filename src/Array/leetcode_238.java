package Array;

import java.util.Scanner;

public class leetcode_238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int[] x=mul(ar, n);
		for (int j = 0; j < ar.length; j++) {
			System.out.print(x[j] + " ");
		}

	}

	public static int [] mul(int ar[], int n) {
		int l[] = new int[n];
		l[0] = 1;
		for (int i = 1; i < ar.length; i++) {
			l[i] = l[i - 1] * ar[i - 1];
			
		}
		int r=1;
		for (int j = ar.length - 1; j >= 0; j--) {
			l[j] = l[j] * r;
			r*=ar[j];
		}
		return l;

	}
}
