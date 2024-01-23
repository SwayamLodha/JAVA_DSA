package Resursion;

import java.util.*;

public class combi_2_leetcode_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(c);
		int t = 8;
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		sum(c, t, 0,ll,ans);
		System.out.println(ans);
	}

	public static void sum(int[] c, int t,  int idx, List<Integer> ll , List<List<Integer>> ans ) {
		// TODO Auto-generated method stub
		if(t==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for (int i = idx; i < c.length; i++) {
			if(i!=idx && c[i]==c[i-1]) {
				continue;
			}
			if(c[i]<=t) {
				ll.add(c[i]);
				sum(c,t-c[i],i+1,ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

}
