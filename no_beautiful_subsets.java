import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.event.ListDataEvent;

public class no_beautiful_subsets {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 7, 10 };
        int k = 3;
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();

        rec(nums, new ArrayList<>(), 0, ll, k);
        // System.out.println(ll);
        System.out.println(ll.size());
    }

    public static void rec(int[] nums, ArrayList list, int j, ArrayList<ArrayList<Integer>> ll, int k) {
        if (j > nums.length) {
            return;
        } else if (!list.isEmpty()) {
            if (list.size() == 1) {
                // System.out.println(list);

                ll.add(new ArrayList<>(list));
            }

            else {
                int as = (int) list.get(list.size() - 2) - (int) list.get(list.size() - 1);
                if (as == -k) {
                    return;
                }
                ll.add(new ArrayList<>(list));
                // System.out.println(list);
            }

        }
        for (int i = j; i < nums.length; i++) {
            int ans = 0;

            list.add(nums[i]);
            rec(nums, list, i + 1, ll, k);
            list.remove(list.size() - 1);

        }
    }
}
