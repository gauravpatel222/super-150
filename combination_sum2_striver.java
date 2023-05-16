import java.util.ArrayList;

public class combination_sum2_striver {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;

        comb(nums, target, new ArrayList<>(), 0);
    }

    public static void comb(int[] nums, int target, ArrayList list, int i) {
        if (i == nums.length)
            return;
        if (target == 0 && i < nums.length) {
            System.out.println(list);
            return;
        }
        if (target < 0 && i < nums.length) {
            return;
        }
        list.add(nums[i]);
        comb(nums, target - nums[i], list, i);
        list.remove(list.size() - 1);
        comb(nums, target, list, i + 1);
    }
}
