public class split1_rec {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        rec(nums, 0, "", 0, "", 0);
    }

    public static void rec(int[] nums, int i, String ans1, int sum1, String ans2, int sum2) {
        if (i == nums.length) {
            // if (sum1 == sum2)
            System.out.println(ans1 + "    " + ans2);
            return;
        }
        rec(nums, i + 1, ans1 + nums[i] + " ", sum1 + nums[i], ans2, sum2);
        rec(nums, i + 1, ans1, sum1, ans2 + nums[i] + " ", sum2 + nums[i]);

    }
}
