package Array;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int item = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.print(test(ar, item));
	}

	public static int test(int ar[], int item) {
		for (int j = 0; j < ar.length; j++) {
			if (ar[j] == item) {
				// System.out.print(j);
				return j;
			}
		}
		return -1;
	}
}
