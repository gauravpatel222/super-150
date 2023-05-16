import java.util.Stack;

public class infinix_2_postfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            int a = s.charAt(i);
            if (a >= 97 && a <= 122) {
                ans += s.charAt(i);
            }
            else if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='+'){
                    if(stack.peek()=='-'||stack.peek()=='*'||stack.peek()=='/')
            }
        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        System.out.println(ans);
    }
}
