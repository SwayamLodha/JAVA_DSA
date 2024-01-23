package Array;

import java.util.Scanner;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int min = ar[0];
		for (int j = 0; j < ar.length; j++) {
			if (min > ar[j]) {
				int t = min;
				min = ar[j];
				ar[j] = t;
			}
		}
		System.out.println(min);
	}

}
