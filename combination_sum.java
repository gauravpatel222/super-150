import java.util.ArrayList;

public class combination_sum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;
        combo_sum(nums, target, new ArrayList<>());
    }

    public static void combo_sum(int[] nums, int target, ArrayList list) {
        if (target == 0) {

            System.out.println(list);
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            combo_sum(nums, target - nums[i], list);
            list.remove(list.size() - 1);
        }

    }
}
