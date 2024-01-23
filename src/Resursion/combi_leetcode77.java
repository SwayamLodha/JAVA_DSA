package Resursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class combi_leetcode77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int k = 2;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		comb(board, k, 0, 0, ll, ans);
		System.out.println(ans);
	}

	public static void comb(boolean[] board, int tc, int cc, int idx, List<Integer> ll, List<List<Integer>> ans) {
		if (tc == cc) {
			// System.out.println(ans);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				ll.add(i + 1);
				comb(board, tc, cc + 1, i + 1, ll, ans);
				ll.remove(ll.size() - 1);
				board[i] = false;
				
			}
		}
	}
}
