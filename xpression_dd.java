import java.util.ArrayList;

public class xpression_dd {
    public static void main(String[] args) {
        String s = "234";
        ArrayList<String> list = new ArrayList<>();

        rec(s, 0, 0, 0, list, "", 10);
        System.out.println(list);
    }

    public static void rec(String s, int i, long totalsum, long prevsum, ArrayList<String> list, String ans,
            int target) {
        if (i == s.length()) {
            if (totalsum == target) {
                list.add(ans);
            }
            return;
        }
        for (int j = i; j < s.length(); j++) {
            long curr = Long.parseLong(s.substring(i, j + 1));
            if (i == 0) {
                rec(s, j + 1, curr, curr, list, ans + curr, target);
            } else {
                rec(s, j + 1, totalsum + curr, curr, list, ans + "+" + curr, target);
                rec(s, j + 1, totalsum - curr, -curr, list, ans + "-" + curr, target);
                rec(s, j + 1, totalsum - prevsum + prevsum * curr, prevsum * curr, list, ans + "*" + curr, target);

            }
        }
    }
}