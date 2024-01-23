package Resursion;

import java.util.*;

public class Palindrome_Partitioning_leetcode_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		palin(s,"");
	}

	public static void palin(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}			
			for (int i = 0; i < s.length(); i++) {
				String x=s.substring(0,i+1);
				if(palin1(x)==true) {
			palin(s.substring(i+1),ans+x+" ");	
				}
	}	
}
	public static boolean palin1(String s) {
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j <= s.length(); j++) {
				
				String s1=s.substring(i,j);
				int a=0;
				int b=s1.length()-1;
				int c=0;
				for (int k = 0; k < s1.length(); k++) {
					if(s1.charAt(a)==s1.charAt(b)) {
						a++;
						b--;
					}
					else {
						c++;
						break;
					}
				}
				if(c==0) {
					return true;
				}
				
			}
		}
		return false;
	}
}
