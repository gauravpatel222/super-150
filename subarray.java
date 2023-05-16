package recursion;

public class subarray {
    public static void main(String[] args) {
        int[] nums = { 84, -37, 32, 40, 95 };
        System.out.println(shortestSubarray(nums, 167));

    }

    public static int shortestSubarray(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int sum2 = 0;
        int length = 123456;
        while (i < nums.length) {
            sum += nums[i];
            if (nums[i] < 0) {
                sum = 0;
                j = i + 1;

            }
            sum2 += nums[i];
            if (sum >= k) {
                length = Math.min(length, i - j + 1);
            }
            if (sum > k) {
                while (j < nums.length && sum > k) {
                    if (nums[j] > 0)
                        sum = sum - nums[j];
                    j++;

                    if (sum >= k) {

                        length = Math.min(length, i - j + 1);
                        System.out.println(length + "cccc");
                    }
                }
            }

            System.out.println(length);
            i++;
        }

        if (length == 123456) {
            return -1;
        }

        return length;

    }

}
