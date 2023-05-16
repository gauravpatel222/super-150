import java.util.Stack;

public class decode_string {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        Stack<String> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                stack2.push(Integer.parseInt(s.charAt(i) + ""));
            } else if (s.charAt(i) == ']') {
                String ans = "";
                boolean check = true;
                while (check) {
                    ans = ans + stack1.pop();
                    if (stack1.peek().equals("[")) {
                        check = false;
                    }
                }
                if (!stack1.isEmpty())
                    stack1.pop();
                StringBuilder build = new StringBuilder(ans);
                build.reverse();
                ans = build.toString();
                if (!stack2.isEmpty()) {
                    ans = ans.repeat(stack2.pop());
                }
                stack1.push(ans);

            } else {
                stack1.push(s.charAt(i) + "");
            }
        }
        String ans = "";
        while (!stack1.isEmpty()) {
            ans += stack1.pop();
        }
        StringBuilder build = new StringBuilder(ans);
        build.reverse();
        ans = build.toString();
        System.out.println(ans);

    }
}
