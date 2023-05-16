import java.util.ArrayList;

public class new1 {
    public static void main(String[] args) {

        String s = "3z4";
        ArrayList<String> list = new ArrayList<>();
        rec(s, 0, list, "");
        System.out.print(list);

    }

    public static void rec(String s, int i, ArrayList list, String ans) {
        if (ans.length() == s.length()) {
            list.add(ans);
            return;
        }
        if (i > s.length() - 1)
            return;

        int aa = s.charAt(i);
        System.out.println(aa);
        if (aa >= 97 && aa < 124) {
            rec(s, i + 1, list, ans + s.charAt(i));
            rec(s, i + 1, list, ans + (Character.toUpperCase(s.charAt(i))));

        } else if (aa >= 65 && aa <= 92) {
            rec(s, i + 1, list, ans + s.charAt(i));
            rec(s, i + 1, list, ans + (Character.toLowerCase(s.charAt(i))));
        } else {
            rec(s, i + 1, list, ans + s.charAt(i));
        }
    }
}
