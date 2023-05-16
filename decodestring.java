import java.util.Deque;
import java.util.LinkedList;

public class decodestring {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decode(s));

    }

    public static String decode(String s) {
        Deque<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray())
            queue.offer(c);
        return helper(queue);
    }

    public static String helper(Deque<Character> queue) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (!queue.isEmpty()) {
            char c = queue.poll();
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                String sub = helper(queue);
                for (int i = 0; i < num; i++)

                    sb.append(sub);
                num = 0;
            } else if (c == ']') {
                break;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
