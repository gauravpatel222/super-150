import java.util.ArrayList;

public class permt_seq {
    public static void main(String[] args) {
        String s = "123";
        boolean[] check = new boolean[s.length()];
        ArrayList<String> list = new ArrayList<>();
        rec(s, check, list, "");
        System.out.println(list);
    }

    public static void rec(String s, boolean[] check, ArrayList list, String ans) {
        if (ans.length() == s.length()) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (check[i] == false) {
                check[i] = true;
                rec(s, check, list, ans + s.charAt(i));
                check[i] = false;
            }
        }

    }
}
