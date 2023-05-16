package recursion;

import java.io.ObjectInputFilter.Status;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 45, 5 };
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(check(nums, list, 0));
    }

    public static ArrayList<Integer> check(int[] nums, ArrayList<Integer> list, int i) {
        if (i == nums.length) {
            return list;
        }
        if (nums[i] == 1) {
            list.add(i);
            return check(nums, list, i + 1);
        } else {
            return check(nums, list, i + 1);
        }

    }
}
