public class sliding_window_max {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] ans = new int[nums.length - k + 1];
        int max = 0;
        int index = 0;
        for (int i = 0; i < k; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        ans[0] = max;
        int ansindex = 1;
        for (int i = k; i < nums.length; i++) {
            if (nums[i] >= nums[index]) {
                ans[ansindex++] = nums[i];
                max = nums[i];
                index = i;
                continue;
            }
            if (i - index <= k) {
                ans[ansindex++] = nums[index];
                continue;
            }
            int last = index + 1;
            max = 0;
            while (last <= i) {
                if (max < nums[last]) {
                    index = last;
                    max = nums[last];

                }
                last++;
            }
            ans[ansindex++] = nums[index];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}