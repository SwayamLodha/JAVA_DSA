package Maps;

import java.util.HashMap;

public class leetcode_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestConsecutive(int[] n) {
		HashMap<Integer, Boolean> m = new HashMap<>();
		for (int i = 0; i < n.length; i++) {
			if (m.containsKey(n[i] - 1)) {
				m.put(n[i], false);
			} else {
				m.put(n[i], true);
			}
			if (m.containsKey(n[i] + 1)) {
				m.put(n[i] + 1, false);
			}

		}
		int ans = 0;
		for (int key : m.keySet()) {
			if (m.get(key) == true) {
				int count = 0;
				while (m.containsKey(key)) {
					count++;
					key++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
	}

}
