package Resursion;

import java.util.Scanner;

public class Dice_paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\n" + jump(n, 0, ""));
	}

	public static int jump(int end, int curr, String x) {
		if (curr == end) {
			System.out.print(x + " ");
			return 1;

		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += jump(end, curr + dice, x + dice);
		}
		return count;
	}
}
