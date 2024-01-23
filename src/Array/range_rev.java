package Array;

import java.util.Scanner;

public class range_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for (int j = a; j < b; j++) {
			int t = ar[j];
			ar[j] = ar[b];
			ar[b] = t;
			b--;
		}
		for (int x = 0; x < ar.length; x++) {
			System.out.print(ar[x] + " ");
		}
	}

}
