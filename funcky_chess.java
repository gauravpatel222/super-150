import java.util.Scanner;

public class funcky_chess {
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zero = 0;
        int n = 3;
        int[][] nums = { { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 } };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (nums[i][j] == 0)
                    zero++;
            }
        }
        boolean[][] check = new boolean[n][n];
        boolean[][] check1 = new boolean[n][n];
        rec(nums, n, 0, 0, check, check1);
        System.out.print(count);

    }

    public static void rec(int[][] nums, int n, int r, int c, boolean[][] check, boolean[][] check1) {
        if (r < 0 || c < 0 || r > n - 1 || c > n - 1) {
            return;
        }
        if (nums[r][c] == 0)
            return;
        // (r-2,c-1), (r-2,c+1), (r-1,c-2), (r-1,c+2),
        // (r+1,c-2), (r+1,c+2), (r+2,c-1), or (r+2,c+1)

        if (check[r][c] == false) {
            check[r][c] = true;
            if (check1[r][c] == false) {
                count++;
                check1[r][c] = true;
            }

            // check[r][c]=false;
            rec(nums, n, r - 2, c - 2, check, check1);
            rec(nums, n, r - 1, c - 2, check, check1);
            rec(nums, n, r - 2, c + 1, check, check1);
            rec(nums, n, r - 1, c + 2, check, check1);
            rec(nums, n, r + 1, c - 2, check, check1);
            rec(nums, n, r + 1, c + 2, check, check1);
            rec(nums, n, r + 2, c - 1, check, check1);
            rec(nums, n, r + 2, c + 1, check, check1);
            check[r][c] = false;

        } else
            return;

    }
}
