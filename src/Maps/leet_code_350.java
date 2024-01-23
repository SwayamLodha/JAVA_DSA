package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class leet_code_350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (m.containsKey(nums1[i])) {
				m.put(nums1[i], m.get(nums1[i]) + 1);
			} else {
				m.put(nums1[i], 1);
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			if(m.containsKey(nums2[i]) && m.get(nums2[i])>0 ) {
				list.add(nums2[i]);
				m.put(nums2[i], m.get(nums2[i]) - 1);
			}
		}
		int [] ans=new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=list.get(i);
		}
		return ans;
	}
}
