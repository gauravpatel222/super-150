import java.util.HashSet;

public class letter_tile_poss {
    public static void main(String[] args) {
        String s = "aab";
        HashSet<String> list = new HashSet<>();
        rec(s, list, 0, "");
        System.out.println(list);

    }

    public static void rec(String s, HashSet list, int i, String ans) {
        if (i == s.length()) {

            boolean[] check = new boolean[ans.length()];
            perm(list, ans, 0, "", check);
            // list.add(ans);

            return;
        }
        rec(s, list, i + 1, ans + s.charAt(i));
        rec(s, list, i + 1, ans);
    }

    public static void perm(HashSet list, String ans, int i, String ans1, boolean[] check) {
        if (ans1.length() == ans.length()) {

            list.add(ans1);
            return;

        }

        for (int j = 0; j < ans.length(); j++) {
            if (check[j] == true)
                continue;

            check[j] = true;
            perm(list, ans, j, ans1 + ans.charAt(j), check);
            check[j] = false;
        }

    }
}
