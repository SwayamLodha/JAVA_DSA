package Resursion;

import java.util.Scanner;

public class Rat_N_Cheese {
		static boolean f=false; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] a = new char[n][m];
		for (int i = 0; i < a.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				a[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		rat(0, 0, a, ans);
		if(f==false) {
			System.out.println("No Path Found");
		}
	}

	public static void rat(int cr, int cc, char[][] a, int ans[][]) {
		if (cc == a[0].length - 1 && cr == a.length - 1) {
			if (a[cr][cc] == 'O') {
				f=true;
				ans[cr][cc] = 1;
				display(ans);
				//ans[cr][cc] = 0;
			}
			return;

		}
	//	display(ans);
		if (cc < 0 || cc >= a[0].length || cr < 0 || cr >= a.length || a[cr][cc] == 'X') {
			return;
		}
		int[] r = { 0, -1, 0, 1 };
		int[] c = { 1, 0, -1, 0 };
		a[cr][cc] = 'X';
		ans[cr][cc] = 1;

		for (int i = 0; i < c.length; i++) {
			rat(cr + r[i], cc + c[i], a, ans);

		}
		a[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
