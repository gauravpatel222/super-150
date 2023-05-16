public class vivek_loves_array_gam {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 3, 3 };

        // 4 5 0 6 7 7 8
        int x = rec(nums, 0, nums.length - 1);
        System.out.println(x);
    }

    public static int rec(int[] nums, int si, int ei) {
        if (si > ei)
            return 0;
        if (si == ei)
            return 1;

        int[] prefix = new int[ei - si + 1];
        int sum = 0;
        int st = si;
        for (int i = 0; i <= prefix.length && st < nums.length - 1; i++) {
            sum += nums[st++];
            prefix[i] = sum;
        }
        int first = 0;
        int last = 0;
        for (int i = si; i < ei; i++) {
            if (prefix[prefix.length - 1] - prefix[i] == prefix[i]) {
                first = rec(nums, 0, i);
                last = rec(nums, i + 1, prefix.length - 1);
                break;

            }
        }
        return Math.max(first, last) + 1;
    }
}
