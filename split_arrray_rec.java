import java.util.ArrayList;

public class split_arrray_rec {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 5, 6 };
        int s = 18
        ;
        rec(nums, new ArrayList<>(), 0, s, 0);
    }

    public static void rec(int[] nums, ArrayList list, int sum, int s, int j) {

        if (2 * sum == s) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.print("and ");
            for (int i = 0; i < nums.length; i++) {
                if (!list.contains(nums[i])) {
                    System.out.print(nums[i] + " ");
                }
            }
            System.out.println();

            return;
        }
        if (j == nums.length) {
            return;
        }
        for (int i = j; i < nums.length; i++) {
            list.add(nums[i]);
            rec(nums, list, sum + nums[i], s, i + 1);
            list.remove(list.size() - 1);
        }

    }
}
