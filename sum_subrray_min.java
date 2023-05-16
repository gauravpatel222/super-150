import java.util.Stack;

public class sum_subrray_min {
    public static void main(String[] args) {
        int nums[] = { 71, 55, 82, 55 };
        Stack<Integer> stack = new Stack<>();
        int[] pr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                stack.push(i);
                pr[i] = -1;
                continue;

            }
            pr[i] = stack.peek();
            stack.push(i);
        }
        while (!stack.isEmpty())
            stack.pop();
        int[] next = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                stack.push(i);
                next[i] = nums.length;
                continue;

            }
            next[i] = stack.peek();
            stack.push(i);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++)
            System.out.print(next[i]);
        System.out.println();
        for (int i = 0; i < nums.length; i++)
            System.out.print(pr[i]);
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            int left = i - pr[i];
            int right = next[i] - i;
            ans += (left * right) * nums[i];
            System.out.println(ans);
        }
        System.out.println(ans);

    }
}
