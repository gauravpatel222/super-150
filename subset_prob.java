import java.util.Scanner;

public class subset_prob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] nums = { 1, 2, 3 };

        int target = 3;
        rec(n, nums, target, 0, "");
    }

    public static void rec(int n, int[] nums, int target, int i, String s) {
        if (target == 0) {
            System.out.print(s + " ");
            return;
        }
        if (target < 0)
            return;
        for (int j = i; j < nums.length; j++) {
            rec(n, nums, target - nums[j], j + 1, s + String.valueOf(nums[j]));
        }
    }
}
