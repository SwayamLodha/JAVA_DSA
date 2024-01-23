package Resursion;

import java.util.Iterator;

public class keypad {

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12";
		printkeypad(s, "");
	}

	public static void printkeypad(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String pressStr = key[ch - 48];
		for (int i = 0; i < pressStr.length(); i++) {
			printkeypad(ques.substring(1), ans + pressStr.charAt(i));
		}
	}
}
