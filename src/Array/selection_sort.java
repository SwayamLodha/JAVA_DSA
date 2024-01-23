package Array;

import java.util.Scanner;

public class selection_sort {

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

		for (int i = 0; i < ar.length; i++) {
			int min = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[min] > ar[j]) {
					min = j;
				}

			}
			int t = ar[i];
			ar[i] = ar[min];
			ar[min] = t;
		}

	}
}
