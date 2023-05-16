import java.util.ArrayList;

public class n_queenn {
    public static void main(String[] args) {
        int n = 2;
        boolean[][] board = new boolean[n][n];
        rec(n, 0, 0, board);

    }

    static int c = 0;

    public static void rec(int n, int row, int col, boolean[][] board) {
        if (n == 0) {
            display(board);
            c++;
            return;
        }

        if (row == board.length - 1 && col == board[0].length) {
            return;
        }
        if (col == board.length) {
            rec(n, row + 1, 0, board);
            return;

        }
        if (isvalid(row, col, board, n)) {
            board[row][col] = true;
            rec(n - 1, row, col + 1, board);
            board[row][col] = false;
        }
        rec(n, row, col + 1, board);

    }

    public static boolean isvalid(int row, int col, boolean[][] board, int n) {
        if (check(row - 1, col - 2, n)) {
            if (board[row - 1][col - 2])
                return false;
        }
        if (check(row + 1, col - 2, n)) {
            if (board[row + 1][col - 2])
                return false;
        }
        if (check(row - 2, col + 1, n)) {
            if (board[row - 2][col + 1])
                return false;
        }
        if (check(row - 2, col - 1, n)) {
            if (board[row - 2][col - 1])
                return false;
        }
        return true;

    }

    public static boolean check(int row, int col, int n) {
        if (row >= 0 && col >= 0 && row < n && col < n)
            return true;
        /* */
        return false;

    }

    public static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    System.out.print("{" + i + "-" + j + "}" + " ");
                }
            }
        }

    }

}