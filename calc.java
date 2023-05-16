import java.util.Stack;

public class calc {
    public static void main(String[] args) {
        String s = "21556";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (!stack.isEmpty()) {
                if (Character.isDigit(s.charAt(i))) {
                    if (Character.isDigit(stack.peek().charAt(0))) {
                        System.out.println(stack.peek());
                        String ans = stack.pop() + s.charAt(i);

                        stack.push(ans);
                    }
                }
            }
            if (s.charAt(i) == ' ')
                continue;
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i) + "");
            } else if (s.charAt(i) != ')' && !stack.isEmpty()
                    && (stack.peek().equals("+") || stack.peek().equals("-"))) {
                if (stack.peek().equals("+")) {
                    stack.pop();

                    int ans = Integer.parseInt(stack.pop()) + Integer.parseInt(s.charAt(i) + "");
                    stack.push(String.valueOf(ans));
                }
                if (stack.peek().equals("-")) {
                    stack.pop();

                    int ans = -Integer.parseInt(s.charAt(i) + "") + Integer.parseInt(stack.pop() + "");
                    stack.push(String.valueOf(ans));
                }

            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                stack.push(s.charAt(i) + "");
            } else if (s.charAt(i) == ')') {
                Stack<String> helper = new Stack<>();
                while (!stack.peek().equals("(")) {
                    if (helper.isEmpty()) {
                        helper.push(stack.pop());
                        continue;
                    }
                    if (helper.peek().equals("+")) {
                        helper.pop();

                        int ans = Integer.parseInt(stack.pop() + "") + Integer.parseInt(helper.pop() + "");
                        helper.push(String.valueOf(ans));
                    } else if (helper.peek() == "-") {
                        helper.pop();

                        int ans = Integer.parseInt(stack.pop() + "") - Integer.parseInt(helper.pop() + "");
                        helper.push(String.valueOf(ans));
                    } else
                        helper.push(stack.pop());

                }
                stack.pop();
                stack.push(helper.peek());
            } else
                stack.push(s.charAt(i) + "");

        }
        if (stack.size() == 1)
            System.out.println(stack.pop());
        // return Integer.parseInt(stack.pop());
        Stack<String> helper = new Stack<>();
        while (!stack.isEmpty()) {
            if (helper.isEmpty())
                helper.push(stack.pop());
            if (helper.peek().equals("+")) {
                helper.pop();

                int ans = Integer.parseInt(stack.pop() + "") + Integer.parseInt(helper.pop() + "");
                helper.push(String.valueOf(ans));
            } else if (helper.peek() == "-") {
                helper.pop();

                int ans = Integer.parseInt(stack.pop() + "") - Integer.parseInt(helper.pop() + "");
                helper.push(String.valueOf(ans));
            } else
                helper.push(stack.pop());
        }
        System.out.println(helper.peek());
        System.out.println(Integer.parseInt(helper.peek()));

    }
}