package DAA_LAB;
import java.util.*;

public class NQ_6 {
   static int N = 8;

    private static void solveNQueens() {
        int[][] board = new int[N][N];
        if (solveNQueensUtil(board, 0)) {
            printSolution(board);
        } else {
            System.out.println("Solution does not exist.");
        }
    }

    private static boolean solveNQueensUtil(int[][] board, int col) {
        if (col >= N) {
            return true;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveNQueensUtil(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0; // Backtrack
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        // Check this row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printSolution(int[][] board) {
        System.out.println("Solution:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((board[i][j] == 1) ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("The solution to the N-Queens with N equal to 8 is:");
        solveNQueens();
    }
}

