package Resursion;

import java.util.Iterator;

public class Quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ar= {7,5,3,1,9,4};
		long st=System.nanoTime();
		sort(ar,0,ar.length-1);
		long et=System.nanoTime();
		double tt=(et-st)/1e6;
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("time taken  "+tt);
	}

	public static void sort(int[] ar, int l, int h) {
		if(l>=h) {
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
