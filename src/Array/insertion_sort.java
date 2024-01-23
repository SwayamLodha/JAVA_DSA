package Array;

import java.util.Scanner;

public class insertion_sort {

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
			int j = i - 1;
			int item = ar[i];
			while (ar[j] > item) {
				ar[j + 1] = ar[j];
				j--;
				if (j < 0) {
					break;
				}
			}
			j++;
			ar[j] = item;

		}
	}
}
