public class no_of_island {
    public static void main(String[] args) {
        int[][] nums = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 1) {

                    boolean[][] check = new boolean[nums.length][nums[0].length];
                    max = Math.max(max, rec(nums, i, j, check));
                }
            }
        }
        System.out.println(max);

    }

    public static int rec(int[][] nums, int i, int j, boolean[][] check) {
        if (i < 0 || j < 0 || i > nums.length - 1 || j > nums[0].length - 1) {
            return 0;
        }
        if (nums[i][j] == 0) {
            return 0;
        }
        if (check[i][j] == true) {

            return 0;
        }
        check[i][j] = true;
        int left = rec(nums, i, j - 1, check);
        int right = rec(nums, i, j + 1, check);
        int top = rec(nums, i + 1, j, check);
        int bottom = rec(nums, i - 1, j, check);
        check[i][j] = false;
        return left + right + top + bottom + 1;

    }
}
