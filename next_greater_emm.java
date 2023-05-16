import java.util.Stack;

public class next_greater_emm {
    public static void main(String[] args) {
        int random = (int) Math.random();
        int[] nums = { 1, 2, 3, 4, 3 };
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 2 * nums.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums[i % nums.length]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(nums[i % nums.length]);
                ans[i % nums.length] = -1;
                continue;
            } else {
                ans[i % nums.length] = stack.peek();
                stack.push(nums[i % nums.length]);
            }

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
