package Resursion;

public class N_Queen {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int n=4;
		boolean [][] board=new boolean[n][n];
		printpath(board , 0 , n);
	}

	public static void printpath(boolean[][] board, int r, int tq) {
		// TODO Auto-generated method stub
		if(tq==0) {
			display(board);
			return;
		}
		if(r==board.length) {
			return;
		}
		for (int c = 0; c < board.length; c++) {
			if(isitpossible(board,r,c)==true) {
				board[r][c]=true;
				printpath(board,r+1,tq-1);
				board[r][c]=false;
			}
		}
		
	}

	public static boolean isitpossible(boolean[][] board, int r, int c) {
		// TODO Auto-generated method stub
		int row=r;
		while(row>=0) {
			if(board[row][c]==true) {
				return false;
			}
			row--;
		}
		row=r;
		int col=c;
		while(col>=0 && row>=0) {
			if(board[row][col]==true) {
				return false;
			}
			col--;
			row--;
		}
		row=r;
		col=c;
		while(col<board.length && row>=0) {
			if(board[row][col]==true) {
				return false;
			}
			col++;
			row--;
		}
		return true;
	}

	public static void display(boolean [][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("************************");
	}

}

