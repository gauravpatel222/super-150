public class array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 655, 21 };
        System.out.println(check(nums, 0));
    }

    public static boolean check(int[] nums, int i) {

        if (i == nums.length - 1) {
            return true;
        }
        return nums[i] < nums[i + 1] && check(nums, i + 1);
    }
}
