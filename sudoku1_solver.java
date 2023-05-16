public class sudoku1_solver {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        int b = 5;
        char c = (char) (5 - '5');
        System.out.println((char) (b + '0'));
        rec(grid, 0, 0);

    }

    public static void rec(int[][] grid, int row, int col) {
        if (col > 8) {
            row++;
            col = 0;
        }
        if (row == 9) {
            display(grid);
            return;
        }
        if (grid[row][col] != 0) {
            rec(grid, row, col + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (issafe(grid, row, col, i)) {
                    grid[row][col] = i;
                    rec(grid, row, col + 1);
                    grid[row][col] = 0;
                }
            }
        }

    }

    public static boolean issafe(int[][] grid, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == val)
                return false;
            if (grid[i][col] == val)
                return false;
        }
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == val)
                    return false;
            }
        }
        return true;
    }

}
