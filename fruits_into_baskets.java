package recursion;

import java.util.HashMap;

public class fruits_into_baskets {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 2, 2, 2, 1 };
        System.out.println(totalFruit(nums));

    }

    public static int totalFruit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int c = 0;
        int length = 0;
        while (i < nums.length) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.size() > 2) {
                System.out.println(map + "jjj");
                int k = j;
                while (k < i) {
                    int s = map.get(nums[k]);
                    map.put(nums[k], s - 1);

                    if (map.get(nums[k]) == 0) {
                        System.out.println(map);

                        map.remove(nums[k]);

                        System.out.println(j + "     jjjjjjjj");
                        break;
                    }
                    k++;

                }
                j = k + 1;

            }
            length = Math.max(length, i - j + 1);
            i++;
        }
        return length;
    }
}