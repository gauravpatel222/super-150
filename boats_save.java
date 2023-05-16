import java.util.Arrays;

public class boats_save {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 4, 5, 7 };
        int limit = 7;
        Arrays.sort(nums);
        boolean[] check = new boolean[nums.length];
        int start = 0;
        int last = nums.length - 1;
        int boats = 0;
        while (start <= last) {
            if (nums[start] + nums[last] <= limit) {
                start++;
                last--;
                boats++;
            } else {
                last--;
                boats++;
            }

        }
        System.out.println(boats);
    }
}