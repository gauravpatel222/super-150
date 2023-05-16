import java.util.Scanner;

public class rate_maze_tyoical {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 4;
        String[][] nums = { { "o", "X", "O", "O" },
                { "o", "o", "O", "X" },
                { "o", "o", "X", "O" },
                { "X", "o", "O", "O" },
                { "X", "X", "O", "O" } };
        boolean[][] ans = new boolean[n][m];
        rec(nums, n, m, ans, 0, 0);
    }

    public static void rec(String[][] nums, int n, int m, boolean[][] ans, int i, int j) {
        if (i > n - 1 || j > m - 1)
            return;
        if (i == n - 1 && j == m - 1) {
            ans[i][j] = true;
            display(ans);
            System.out.println("dhn");
            return;
        }
        if (nums[i][j].equals("X"))
            return;
        ans[i][j] = true;
        rec(nums, n, m, ans, i, j + 1);
        // ans[i][j] = false;
        rec(nums, n, m, ans, i + 1, j);
        ans[i][j] = false;
    }

    public static void display(boolean[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                if (ans[i][j]) {
                    System.out.print(1 + " ");
                } else
                    System.out.print("X" + " ");
            }
            System.out.println();
        }

    }
}
