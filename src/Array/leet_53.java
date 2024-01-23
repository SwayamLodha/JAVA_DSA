package Array;

import java.util.Scanner;

public class leet_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println(sum(ar));
	}

	public static int sum(int[] ar) {
		int n = ar.length;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < ar.length; i++) {
			int sum = 0;
			for (int j = i; j < ar.length; j++) {
				sum += ar[j];
				max=Math.max(sum, max);
				
			}

		}
		
		
		return max;
	}

}
