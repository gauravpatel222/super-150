public class valid_sudoku {
    public static void main(String[] args) {
        char[][] grid = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println(isvalid(grid));

    }

    public static boolean isvalid(char[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                for (int i = 0; i < 9; i++) {
                    if (i == row || i == col)
                        ;
                    else if (i != col && grid[row][i] == grid[row][col])

                        return false;
                    else if (row != i && grid[i][col] == grid[row][col])
                        return false;
                }
                int r = row - row % 3;
                int c = col - col % 3;
                for (int i = r; i < r + 3; i++) {
                    for (int j = c; j < c + 3; j++) {
                        if (i == row && j == col) {

                        } else if (grid[i][j] == grid[row][col])
                            return true;
                    }
                }

            }
        }
        return true;
    }
}