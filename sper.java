import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = 213;
        String s = String.valueOf(t);
        ArrayList<String> list = new ArrayList<>();
        rec(s, "", 0, list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void rec(String s, String ans, int i, ArrayList list) {
        if (i == s.length()) {
            System.out.println(ans);
            list.add(ans);
            return;

        }

        rec(s, ans + (char) (Integer.parseInt(s.charAt(i) + "") + 64), i + 1, list);
        if (i < s.length() - 1 && Integer.parseInt(s.substring(i, i + 2)) < 27) {
            rec(s, ans + (char) (Integer.parseInt(s.substring(i, i + 2)) + 64), i + 2, list);
        }
    }
}
