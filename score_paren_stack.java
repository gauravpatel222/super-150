import java.util.Stack;

public class score_paren_stack {
    public static void main(String[] args) {
        String s = "(((()())))";
        Stack<String> stack = new Stack<>();
        // Stack<Integer> nums=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i) + "");
            } else {
                if (stack.peek().equals("(")) {
                    stack.pop();
                    int n = 1;
                    if (!stack.isEmpty() && !stack.peek().equals("(")) {
                        n = n + Integer.parseInt(stack.pop());
                    }
                    stack.push(String.valueOf(n));
                } else {
                    int n = Integer.parseInt(stack.pop());
                    stack.pop();
                    n = n * 2;
                    if (!stack.isEmpty() && !stack.peek().equals("(")) {
                        n = n + Integer.parseInt(stack.pop());
                    }
                    stack.push(String.valueOf(n));

                }
            }
        }
        // return Integer.parseInt(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

    }
}
