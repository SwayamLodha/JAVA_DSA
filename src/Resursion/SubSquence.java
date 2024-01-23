package Resursion;

public class SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		subs(s, "");
	}

	public static void subs(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		subs(ques.substring(1), ans);
		subs(ques.substring(1), ans + ch);
	}
}
