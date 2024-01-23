package String;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		palin(s);
	}
	public static void palin(String s) {
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
					System.out.println(s1);
				}
				
			}
		}
	}

}
