package Resursion;

public class coin_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 6 };
		int n = 10;
		coin(n, coin, "",0);

	}

	public static void coin(int n, int[] c, String ans ,int idx) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < c.length; i++) {
			if (c[i] <= n) {
				coin(n - c[i], c, ans + c[i],i);
				
			}
		}

	}

}
