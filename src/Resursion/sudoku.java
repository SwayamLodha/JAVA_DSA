package Resursion;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		sudokusolver(grid, 0, 0);
	}

	public static void sudokusolver(int[][] grid, int r, int c) {
		// TODO Auto-generated method stub
		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			display(grid);
			return;
		}
		if (grid[r][c] != 0) {
			sudokusolver(grid, r, c + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (isitpossible(grid, r, c, val) == true) {
					grid[r][c] = val;
					sudokusolver(grid, r, c + 1);
					grid[r][c] = 0;
				}
			}
		}

	}

	private static boolean isitpossible(int[][] grid, int r, int c, int val) {
		// TODO Auto-generated method stub
		int col = 0;
		while (col < 9) {
			if (grid[r][col] == val) {
				return false;
			}
			col++;
		}
		int row = 0;
		while (row < 9) {
			if (grid[row][c] == val) {
				return false;
			}
			row++;
		}
		row = r - r % 3;
		col = c - c % 3;
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}

		}

		return true;
	}

	public static void display(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		 
	}
}
