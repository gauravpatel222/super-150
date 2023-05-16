public class word_search {
    public static void main(String[] args) {
        // char[][] nums = { { 'A', 'B', 'C', 'E' },
        // { 'S', 'F', 'C', 'S' },
        // { 'A', 'D', 'E', 'E' } };
        char[][] nums = { { 'A', 'A' } };
        String s = "AAA";
        boolean[][] check = new boolean[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (c == 1) {
                    System.out.println("true");
                    return;
                }
                rec(nums, s, 0, i, j, "", check);
            }
        }
        if (c == 1) {
            System.out.println("true");
            return;
        }
        System.out.println("false");
        // return false;

    }

    static int c = 0;

    public static void rec(char[][] nums, String s, int l, int i, int j, String ans, boolean[][] check) {
        if (i < 0 || j < 0 || i > nums.length - 1 || j > nums[0].length - 1)
            return;
        if (l == s.length()) {
            // System.out.println("true");
            c = 1;
            return;
        }

        if (check[i][j] == true) {

            return;
        }
        if (nums[i][j] != s.charAt(l))
            return;
        if (nums[i][j] == s.charAt(l))
            l++;
        check[i][j] = true;
        rec(nums, s, l, i, j + 1, ans + nums[i][j], check);
        // check[i][j] = false;
        rec(nums, s, l, i + 1, j, ans + nums[i][j], check);
        // check[i][j] = false;
        rec(nums, s, l, i, j - 1, ans + nums[i][j], check);
        check[i][j] = false;

    }
}