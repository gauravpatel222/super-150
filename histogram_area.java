import java.util.Stack;

public class histogram_area {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 6, 2, 3 };

        int area = 0;
        int[] prev = new int[nums.length];
        int[] next = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = stack.peek();
            }
            stack.push(i);
        }
        Stack<Integer> s = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                next[i] = -1;
            } else {
                next[i] = s.peek();
            }
            s.push(i);
        }
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + " ");
        }

    }
}
