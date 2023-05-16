package recursion;

import java.util.ArrayList;

public class permutationret {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        permute(nums, list, 0);
        System.out.println(list);

    }

    public static void permute(int[] nums, ArrayList<ArrayList<Integer>> list, int i1) {
        if (i1 == nums.length) {
            System.out.println(ll);
            list.add(ll);
            return;
        }

        for (int i = 0; i <= ll.size(); i++) {
            int j = 0;
            int z = ll.size();
            while (j < i) {
                ll.add(nums[j]);
                j++;
            }
            ll.add(nums[i1]);
            int k = i;

            while (k < z) {
                ll.add(nums[k]);
                k++;
            }
            permute(nums, list, ll, i1 + 1);

        }
    }
}
