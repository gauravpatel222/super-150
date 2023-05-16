package recursion;

import java.util.ArrayList;

public class permu {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        perm(nums, 0, new ArrayList<>(), list, freq);
        System.out.println(list);
    }

    public static void perm(int[] nums, int i, ArrayList<Integer> in, ArrayList<ArrayList<Integer>> list,
            boolean[] freq) {
        if (nums.length == i) {
            list.add(new ArrayList<>(in));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!freq[j]) {
                freq[j] = true;
                in.add(nums[j]);
                perm(nums, i + 1, in, list, freq);
                in.remove(in.size() - 1);
                freq[j] = false;
            }
        }

    }
}
