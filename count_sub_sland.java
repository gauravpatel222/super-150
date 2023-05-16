public class count_sub_sland {
    public static void main(String[] args) {
        int[][] grid1 = { { 1, 1, 1, 0, 0 },
                { 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 1, 1 } };
        int[][] grid2 = { { 1, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 1 },
                { 0, 1, 0, 0, 0 },
                { 1, 0, 1, 1, 0 },
                { 0, 1, 0, 1, 0 } };
        System.out.println(count(grid1, grid2));

    }

    public static int count(int[][] grid1, int[][] grid2) {
        int length = 0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                if (grid2[i][j] == 1) {
                    if (rec(grid1, grid2, i, j)) {
                        length++;
                    }
                }
            }
        }
        return length;
    }

    public static boolean rec(int[][] grid1, int[][] grid2, int i, int j) {
        if (i < 0 || j < 0 || j > grid1[0].length - 1 || i > grid1.length - 1) {
            return true;

        }
        if (grid2[i][j] == 0) {
            return true;
        }
        if (grid2[i][j] == 1 && grid1[i][j] == 0) {
            return false;
        }

        grid2[i][j] = 0;
        boolean left = rec(grid1, grid2, i, j - 1);
        boolean right = rec(grid1, grid2, i, j + 1);
        boolean top = rec(grid1, grid2, i + 1, j);
        boolean bottom = rec(grid1, grid2, i - 1, j);
        return top && right && left && bottom;

    }

}
