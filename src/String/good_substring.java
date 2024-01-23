package String;

import java.util.Scanner;

public class good_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		palin(s);
	}

	public static void palin(String s) {
		int tc=-1;
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j <= s.length(); j++) {
				String s1=s.substring(i,j);
				int c=0;
				for (int k = 0; k < s1.length(); k++) {
					
					if(s1.charAt(k)=='a' ||s1.charAt(k)=='e' ||s1.charAt(k)=='i' ||s1.charAt(k)=='o' ||s1.charAt(k)=='u' ) {
						c++;
					}
					else {
						break;
					}
				}
				if(tc<c) {
					tc=c;
				}
	}
		}
			System.out.println(tc);


	}
}
