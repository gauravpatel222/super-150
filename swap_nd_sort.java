public class swap_nd_sort {
    public static void main(String[] args) {
        int itm = 4;
        int[] nums = { 5, 7, 2, 3, 8, 1, 4 };
        sort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

    }

    public static void sort(int[] nums, int si, int ei) {
        if (si >= ei)
            return;
        int pi = partition(nums, si, ei);
        sort(nums, si, pi - 1);
        sort(nums, pi + 1, ei);
    }

    public static int partition(int[] nums, int si, int ei) {
        int item = nums[ei];
        int pi = si;
        for (int i = si; i < ei; i++) {
            if (nums[i] < item) {
                int temp = nums[i];
                nums[i] = nums[pi];
                nums[pi] = temp;
                pi++;
            }

        }
        int temp = nums[pi];
        nums[pi] = nums[ei];
        nums[ei] = temp;
        return pi;
    }
}
