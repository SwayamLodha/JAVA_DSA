package Array;

import java.util.Scanner;

public class Spiral_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ar = new int[n][m];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		spiral(ar);
	}

	public static void spiral(int[][] ar) {
		int minr = 0;
		int maxr = ar.length - 1;
		int minc = 0;
		int maxc = ar[0].length - 1;
		int x = ar.length * ar[0].length;
		int c = 0;
		while (c < x) {
			for (int i = minc; i <= maxc && c < x; i++) {
				System.out.print(ar[minr][i] + " ");
				c++;
			}
			minr++;
			for (int j = minr; j <= maxr && c < x; j++) {
				System.out.print(ar[j][maxc] + " ");
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < x; i--) {
				System.out.print(ar[maxr][i] + " ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < x; i--) {
				System.out.print(ar[i][minc] + " ");
				c++;
			}
			minc++;
		}
	}

}
