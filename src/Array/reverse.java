package Array;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int g = ar.length - 1;
		for (int j = 0; j < ar.length / 2; j++) {
			int t = ar[j];
			ar[j] = ar[g];
			ar[g] = t;
			g--;
		}
		for (int x = 0; x < ar.length; x++) {
			System.out.print(ar[x] + " ");
		}

	}

}
