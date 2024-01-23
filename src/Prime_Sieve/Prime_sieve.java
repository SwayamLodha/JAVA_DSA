package Prime_Sieve;

public class Prime_sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(10);
	}

	public static void prime(int n) {
		// TODO Auto-generated method stub
		boolean[] p = new boolean[n + 1];
		p[0] = true;
		p[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (p[i] == false) {
				for (int mul = 2; mul * i <= n; mul++) {
					p[i * mul] = true;
				}
			}
		}

		for (int i = 2; i < n; i++) {
			if (p[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

}
