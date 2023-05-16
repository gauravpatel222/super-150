import java.util.Arrays;

public class koko_eat_banana {
    public static void main(String[] args) {
        int[] nums = { 3125 };
        int h = 280;
        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length - 1];
        int mid = 0;

        while (low < high) {
            mid = (low + high) / 2;
            int check = 0;
            for (int i = 0; i < nums.length; i++) {
                int s = nums[i] / mid;
                check += s;
                if (nums[i] % mid != 0)
                    check++;
            }
            if (check > h) {
                low = mid + 1;
            } else
                high = mid;

        }
        System.out.println(low);

    }
}
