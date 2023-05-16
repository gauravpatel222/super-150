public class lrgest_area_histogram {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 2 };
        int area = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int right = 0;
            while (j < nums.length && nums[i] <= nums[j]) {
                right++;
                j++;
            }
            j = i - 1;
            int left = 0;
            while (j >= 0 && nums[i] <= nums[j]) {
                j--;
                left++;
            }
            area = Math.max(area, (right + left + 1) * nums[i]);

        }
        System.out.println(area);
        // return area;

    }
}