import java.util.ArrayList;

public class sequential_digits {
    public static void main(String[] args) {
        int low = 234;
        int high = 2314;
        ArrayList list = new ArrayList<>();
        rec(low, high, list, "", 0);
        System.out.println(list);
    }

    public static void rec(int low, int high, ArrayList list, String s, int n) {
        if (s.length() > 1) {
            if (Integer.parseInt(s.charAt(s.length() - 1) + "") != Integer.parseInt(s.charAt(s.length() - 2) + "")
                    + 1) {
                return;
            }

        }
        if (n > high)
            return;

        if (!s.isEmpty() && n > low) {
            if (n < high)
                list.add(n);
            return;
        }
        int i = 0;
        if (n == 0) {
            i = 1;
        }
        for (; i < 10; i++) {

            rec(low, high, list, s + i, n * 10 + i);
        }
    }
}
