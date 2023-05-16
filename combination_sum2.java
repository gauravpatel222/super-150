import java.util.ArrayList;

public class combination_sum2 {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 4;
        comb(nums, target, new ArrayList<>(), 0, 0);
    }

    public static void comb(int[] nums, int target, ArrayList list, int i, int s) {
        if (i == nums.length) {
            return;
        }
        if (s == target) {
            System.out.println(list);
            return;
        }
        s = s + nums[i];
        if (s <= target) {
            list.add(nums[i]);
        }
        if (s > target) {
            s = s - nums[i];
        }
        comb(nums, target, list, i + 1, s);
        list.remove(nums[i]);
        comb(nums, target, list, i + 1, s);
    }
}
