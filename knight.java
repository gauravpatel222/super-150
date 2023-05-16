public class knight {
    public static void main(String[] args) {
        int[][] nums = { { 0, 3, 6 },
                { 5, 8, 1 },
                { 2, 7, 4 } };
        int count = 0;
        int ans = nums[0][0];
        int i = 0;
        int j = 0;
        int n = nums.length;
        boolean check = true;
        while (check) {
            if ((i + 1 < nums.length && j + 2 < nums.length) && nums[i + 1][j + 2] == ans + 1) {
                ans++;
                count++;
                i++;
                j = j + 2;
            } else if ((i + 2 < n && j + 1 < n) && nums[i + 2][j + 1] == ans + 1) {
                ans++;
                count++;
                j++;
                i = i + 2;
            } else if ((i - 1 >= 0 && j - 2 >= 0) && nums[i - 1][j - 2] == ans + 1) {
                count++;
                ans++;
                j = j - 2;
                i = i - 1;
            } else if ((i - 2 >= 0 && j - 1 >= 0) && nums[i - 2][j - 1] == ans + 1) {
                count++;
                ans++;
                j = j - 1;
                i = i - 2;
            } else if ((i - 2 >= 0 && j + 1 < n) && nums[i - 2][j + 1] == ans + 1) {
                count++;
                ans++;
                j = j + 1;
                i = i - 2;
            } else if ((i - 1 >= 0 && j + 2 < n) && nums[i - 1][j + 2] == ans + 1) {
                count++;
                ans++;
                j = j + 2;
                i = i - 1;
            } else if ((i + 2 < n && j - 1 >= 0) && nums[i + 2][j - 1] == ans + 1) {
                count++;
                ans++;
                j = j - 1;
                i = i + 2;
            } else if ((i + 1 < n && j - 2 >= 0) && nums[i + 1][j - 2] == ans + 1) {
                count++;
                ans++;
                j = j - 2;
                i = i + 1;
            }

            else {
                System.out.println("false");
                check = false;
            }

        }
        System.out.println("true");

    }
}