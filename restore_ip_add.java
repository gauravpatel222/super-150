import java.util.ArrayList;

public class restore_ip_add {
    public static void main(String[] args) {
        String s = "0000";

        rec(s, new ArrayList<>(), 0, 0, "");
    }

    public static void rec(String s, ArrayList list, int i, int c, String k) {
        if (k.length() == 8) {
            System.out.println(k);
            return;
        }
        if (c >= 4) {
            return;
        }
        if (s.isEmpty())
            return;
        for (int j = 1; j < 4; j++) {
            if (s.length() >= j - 0) {
                String p = s.substring(0, j);
                if (p.length() == 1 || p.charAt(0) != '0') {

                    if (Integer.parseInt(p) <= 255)
                        rec(s.substring(j), list, i + 1, c + 1, k + p + ".");
                }
            }
        }

    }

}
