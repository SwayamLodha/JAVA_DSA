package String;

import java.util.Scanner;

public class CB_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// String s=sc.next();
		String s = "81615";
		int x = sub(s);
		System.out.println(x);
	}

	public static int sub(String s) {
		int count = 0;
		boolean v[] = new boolean[s.length()];
		for (int l = 1; l <= s.length(); l++) {
			for (int si = 0; si <= s.length() - l; si++) {
				int ei = si + l;
				String s1 = s.substring(si, ei);
				if (cb(Long.parseLong(s1)) == true && isvisited(v, si, ei-1) == false) {
					for (int i = si; i <= ei - 1; i++) {
						v[i] = true;
					}
					count++;
				}
			}

		}
		return count;
	}

	public static boolean isvisited(boolean[] visited, int si, int ei) {
		for (int i = si; i <= ei; i++) {
			if (visited[i] == true) {
				return true;
			}
		}
		return false;
	}

	public static boolean cb(long n) {
		int[] ar = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n) {
				return true;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (n % ar[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
