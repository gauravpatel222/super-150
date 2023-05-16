public class island {
    public static int sum = 0;
    public static int max = 0;

    public static void main(String[] args) {

        int[][] grid = { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sum = 0;
                    if (rec(grid, 1, 2)) {

                        max += sum;
                    }
                    System.out.println(max);
                }
            }
        }
        System.out.println(max);
    }

    public static boolean rec(int[][] grid, int i, int j) {
        if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1) {
            if (grid[i][j] == 1) {
                return false;
            }

        }

        if (grid[i][j] == 0)
            return true;
        sum = sum + 1;
        grid[i][j] = 0;
        boolean left = rec(grid, i, j - 1);
        boolean right = rec(grid, i, j + 1);
        boolean top = rec(grid, i + 1, j);
        boolean bottom = rec(grid, i - 1, j);
        return left && right && top && bottom;

    }
}
