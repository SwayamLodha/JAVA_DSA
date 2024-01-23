package Stack_QPs;

import java.util.Stack;

public class find_Celeb_LC_277 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };

		System.out.println(celeb(ar));

	}

	private static int celeb(int[][] ar) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < ar.length; i++) {
			s.push(i);
		}
		while (s.size() > 1) {
			int a = s.pop();
			int b = s.pop();
			if (ar[a][b] == 1) {
				s.push(b);
			} else {
				s.push(a);
			}
		}
		int candidate = s.pop();
		for (int i = 0; i < ar.length; i++) {
			if (i != candidate && (ar[candidate][i] == 1 || ar[i][candidate] == 0)) {
				return -1;
			}
		}
		return candidate;
	}

}
