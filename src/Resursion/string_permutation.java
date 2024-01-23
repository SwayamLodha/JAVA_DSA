package Resursion;

public class string_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		per(s, "");
	}

	public static void per(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			String x = s.substring(0, i) + s.substring(i + 1);
			char ch = s.charAt(i);
			per(x, ans + ch);
		}
	}
}
