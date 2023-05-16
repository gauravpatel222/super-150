import java.util.ArrayList;

public class COMBINATION_sum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;
        rec(nums, 0, target, new ArrayList<>());

    }

    public static void rec(int[] nums, int i, int target, ArrayList list) {
        if (i == nums.length) {
            return;
        }
        if (target == 0) {
            System.out.println(list);
            return;
        }
        if (target < 0)
            return;
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            rec(nums, j, target - nums[j], list);
            list.remove(list.size() - 1);
        }
    }
}
