import java.util.Stack;

public class asteriod_coll {
    public static void main(String[] args) {
        int[] nums = { -2, -1, 1, 2 };

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty()) {
                stack.push(nums[i]);
            } else if (stack.peek() < 0) {
                stack.push(nums[i]);
            } else if (stack.peek() > 0 && nums[i] > 0) {
                stack.push(nums[i]);
            } else {
                int collide = stack.pop();
                if (Math.abs(nums[i]) > collide) {
                    stack.push(nums[i]);

                } else
                    stack.push(collide);
                boolean check = true;
                while (check) {
                    if (stack.size() == 1)
                        break;
                    int ss = stack.pop();
                    if (stack.peek() > 0 && ss < 0) {
                        if (Math.abs(ss) > stack.peek()) {
                            stack.pop();
                            stack.push(ss);
                        } else {
                            int ans = stack.pop();
                            stack.push(ans);
                        }
                    } else
                        check = false;
                }
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.pop();
            System.out.println(ans[i]);
        }

        // return ans;

    }
}