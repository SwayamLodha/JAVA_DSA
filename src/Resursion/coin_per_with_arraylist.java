package Resursion;

import java.util.*;

public class coin_per_with_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] c= {2,3,6,7};
		int s=7;
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		coin(c,s,ll,0,ans);
		System.out.println(ans);
	}

	public static void coin(int[] c, int s, List<Integer> ll,int idx,List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if(s==0) {
		//	System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return ;
		}
		for (int i = idx; i < c.length; i++) {
			if(s>=c[i]) {
				ll.add(c[i]);
				coin(c,s-c[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
		return;
	}

}
