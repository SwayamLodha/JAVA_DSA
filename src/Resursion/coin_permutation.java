package Resursion;

public class coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 6 };
		int n = 10;
		coin(n, coin, "");

	}

	public static void coin(int n, int[] c, String ans ) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		for (int i =0; i < c.length; i++) {
			if (c[i] <= n) {
				coin(n - c[i], c, ans + c[i]);
				
			}
		}

	}

}
