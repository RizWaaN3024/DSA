import java.util.*;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        dfs(0, board, result);
        return result;
    }

    public static void dfs(int col, char[][] board, List<List<String>> result) {
        if (col == board.length) {
            result.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col + 1, board, result);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        int dupRow = row;
        int dupCol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        row = dupRow;
        col = dupCol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
            row++;
        }
        return true;
    }

    public static List<String> construct(char[][] board) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            result.add(s);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        List<List<String>> queen = solveNQueens(n);
        int i = 1;
        for (List<String> it : queen) {
            System.out.println("Arrangement " + i);
            for (String s : it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }
}
