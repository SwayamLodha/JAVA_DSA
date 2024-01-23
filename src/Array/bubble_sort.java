package Array;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sort(ar);
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ");
		}
	}

	public static void sort(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i; j++) {
				if (ar[j] > ar[j + 1]) {
					int t = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = t;
				}
			}
		}
	}
}
