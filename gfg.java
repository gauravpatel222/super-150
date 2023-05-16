import java.util.ArrayList;

public class gfg {
    public static void main(String[] args) {

        // Code Here
        long n = 21;
        String s = "";
        while (n > 0) {
            s += n % 2;
            n = n / 2;

        }
        System.out.println(s.charAt(0));
        ArrayList<String> list = new ArrayList<>();
        rec(s, list, " ", 0);
        System.out.println(list);
        // return list.size();
    }

    public static void rec(String s, ArrayList list, String ans, int j) {
        if (ans.equals(" 101")) {

            list.add(ans);
            return;
        }
        if (ans.length() > 4) {

            return;
        }
        for (int i = j; i < s.length(); i++) {

            rec(s, list, ans + s.charAt(i), i + 1);
        }

    }
}
