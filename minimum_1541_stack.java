import java.util.Stack;

public class minimum_1541_stack {
    public static void main(String[] args) {
        String s = "(()))(()))()())))";

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(2);
            }

            else if (!stack.isEmpty() && stack.peek() == 2 && s.charAt(i) == ')') {
                stack.pop();
                stack.push(1);
            } else if (!stack.isEmpty() && stack.peek() == 1 && s.charAt(i) == ')') {
                stack.pop();

            } else if (stack.isEmpty() && s.charAt(i) == ')') {
                ans += 1;
                stack.push(1);
            }
        }
        while (!stack.isEmpty()) {
            ans = ans + stack.peek();
            stack.pop();
        }
        System.out.println(ans);
        // return ans;
    }
}