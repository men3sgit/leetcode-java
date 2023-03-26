package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    List<List<String>> results = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        backtrack(board, 0);
        return results;
    }

    private void backtrack(boolean[][] board, int row) {
        int n = board.length;
        if (row == n) {
            results.add(createBoard(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = true;
                backtrack(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    private boolean isValid(boolean[][] board, int row, int col) {
        int n = board.length;
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
            int rowDiff = row - i;
            if (col - rowDiff >= 0 && board[i][col - rowDiff]) {
                return false;
            }
            if (col + rowDiff < n && board[i][col + rowDiff]) {
                return false;
            }
        }
        return true;
    }

    private List<String> createBoard(boolean[][] board) {
        List<String> result = new ArrayList<>();
        for (boolean[] booleans : board) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(booleans[j] ? "Q" : ".");
            }
            result.add(sb.toString());
        }
        return result;
    }
}
