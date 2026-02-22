package daily_java_practice.recursion.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensBacktracking {
	private static boolean isSafe(int row, int col, char[][] board, int n) {
		for(int j = 0; j < col; j++) {
			if(board[row][j] == 'Q') {
				return false;
			}
		}
		
		for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if(board[i][j] == 'Q') {
				return false;
			}
		}
		
		for(int i = row, j = col; i < n && j >= 0; i++, j--) {
			if(board[i][j] == 'Q') {
				return false;
			}
		}
		
		return true;
	}
	
	private static void solve(int col, char[][] board, List<List<String>> result, int n) {
		if(col == n) {
			List<String> solution = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				solution.add(new String(board[i]));
			}
			
			result.add(solution);
			return;
		}
		
		for(int row = 0; row < n; row++) {
			if(isSafe(row, col, board, n)) {
				board[row][col] = 'Q';
				solve(col+1, board, result, n);
				board[row][col] = '.';
			}
		}
	}
	
	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
		
		char[][] board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(board[i], '.');
		}
		
		solve(0, board, result, n);
		
		return result;
	}
	
	public static void main(String[] args) {

        int n = 4;

        List<List<String>> solutions = solveNQueens(n);

        for (List<String> board : solutions) {

            for (String row : board) {
                System.out.println(row);
            }

            System.out.println();
        }
    }
}
