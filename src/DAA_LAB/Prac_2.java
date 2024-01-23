package DAA_LAB;

import java.util.Scanner;

public class Prac_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Merge Sort and 2 for Quick Sort");
		int n = sc.nextInt();
		int[] ar = { 3, 5, 1, 7, 1, 4, 8, 5 };
		switch (n) {
		case 1:

			long st = System.nanoTime();
			int ans[] = merge(ar, 0, ar.length - 1);
			long et = System.nanoTime();
			double tt = (et - st) / 1e6;
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + " ");
			}
			System.out.println("\n" + "time taken  " + tt);
			break;
		case 2:
			long st1 = System.nanoTime();
			sort(ar, 0, ar.length - 1);
			long et1 = System.nanoTime();
			double tt1 = (et1 - st1) / 1e6;
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i] + " ");
			}
			System.out.println("\n" + "time taken  " + tt1);
			break;
		}

	}

	public static int[] merge(int[] ar, int l, int h) {
		// TODO Auto-generated method stub
		if (l == h) {
			int a[] = new int[1];
			a[0] = ar[l];
			return a;
		}
		int m = (l + h) / 2;

		int[] fs = merge(ar, l, m);
		int[] ss = merge(ar, m + 1, h);
		return merge2array(fs, ss);
	}

	public static int[] merge2array(int ar1[], int ar2[]) {
		int n = ar1.length;
		int m = ar2.length;
		int ans[] = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (ar1[i] <= ar2[j]) {
				ans[k] = ar1[i];
				k++;
				i++;
			} else {
				ans[k] = ar2[j];
				k++;
				j++;
			}
		}
		while (i < n) {
			ans[k] = ar1[i];
			k++;
			i++;
		}
		while (j < m) {
			ans[k] = ar2[j];
			k++;
			j++;
		}
		return ans;
	}

	public static void sort(int[] ar, int l, int h) {
		if (l >= h) {
			return;
		}
		int idx = insert(ar, l, h);
		sort(ar, l, idx - 1);
		sort(ar, idx + 1, h);

	}

	public static int insert(int[] ar, int l, int h) {
		int last = ar[h];
		int idx = l;
		for (int i = idx; i < h; i++) {
			if (ar[i] <= last) {
				swap(ar, i, idx);
				idx++;
			}
		}
		swap(ar, idx, h);
		return idx;
	}

	public static int[] swap(int[] ar, int a, int b) {
		int t = ar[a];
		ar[a] = ar[b];
		ar[b] = t;
		return ar;
	}

}
