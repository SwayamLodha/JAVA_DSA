package Resursion;

import java.util.*;

public class generate_parenthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		para(n, "", 0, 0, list);
		System.out.println(list);
	}

	public static void para(int n, String x, int ob, int cb, List<String> list) {

		if (ob == n && cb == n) {
			// System.out.println(x);
			list.add(x);
			return;
		}

		if (ob < n) {
			para(n, x + "(", ob + 1, cb, list);
		}
		if (cb < ob) {
			para(n, x + ")", ob, cb + 1, list);
		}
	}
}
