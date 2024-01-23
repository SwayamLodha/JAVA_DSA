package String;

import java.util.Scanner;

public class good_substring_M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		int t=palin(s);
		System.out.println(t);
	}

	public static int palin(String s) {
		int c=0;
		int t=-1;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ) {
				c++;
			}
		
			else{
			t=Math.max(t, c);
			c=0;
			}
		
			
}
		t=Math.max(c, t);
		return t;
	}
}
