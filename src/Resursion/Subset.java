package Resursion;

import java.util.*;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		sub(a, 0, ll, ans);
		System.out.println(ans);
	}

	public static void sub(int[] a, int n, List<Integer> ll, List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if (n == a.length) {
			ans.add(new ArrayList<>(ll));
			return;
		}

		sub(a, n + 1, ll, ans);
		ll.add(a[n]);
		sub(a, n + 1, ll, ans);
		ll.remove(ll.size() - 1);

	}

}
