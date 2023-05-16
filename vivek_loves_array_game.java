public class vivek_loves_array_game {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 0, 1 };
        rec(nums, 0, 0, nums.length - 1, 0);
    }

    public static void rec(int[] nums, int x, int c, int length, int start) {
        if (x == 1) {
            System.out.println(c);
            return;
        }
        int sum1 = nums[start];
        int sum2 = nums[length];
        int i = start + 1;
        int j = length - 1;
        while (i <= j) {
            if (sum1 < sum2) {
                sum1 += nums[i];
                i++;
            } else if (sum2 < sum1) {
                sum2 += nums[j];
                j--;
            }
            if (sum1 == sum2) {
                i++;
                j--;
            }
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
