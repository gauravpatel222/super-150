import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] nums = { 0, 4, 3, 2, 1 };
        rec(nums, list, new ArrayList<Integer>(), 0);
        System.out.println(list);
    }

    public static void rec(int[] nums, ArrayList<ArrayList<Integer>> list, ArrayList ll, int i) {
        if (i == nums.length) {
            System.out.println(ll);
            if (!list.contains(ll) && ll.size() >= 2) {
                list.add(new ArrayList<>(ll));
            }
            return;
        }
        int n = 0;
        if (ll.size() > 0) {
            n = (int) ll.get(ll.size() - 1);

        }
        if (ll.size() == 0 || n <= nums[i]) {
            ll.add(nums[i]);
            rec(nums, list, ll, i + 1);
            ll.remove(ll.size() - 1);
        }

        rec(nums, list, ll, i + 1);

    }
}
