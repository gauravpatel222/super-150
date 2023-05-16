public class count_remove {
    public static void main(String[] args) {
        String s = "hi";
        rec1(s, "", 0);
        // rec2(s,"",0);
        // rec3(s,"",0);
    }

    static int c = 0;

    public static void rec1(String s, String ans, int i) {
        if (i == s.length() - 1) {
            System.out.println(c);
            return;
        }
        if (i == s.length() - 2 && s.substring(i, i + 2).equals("hi")) {
            c++;
            rec1(s, ans, i + 1);
        } else if (s.substring(i, i + 2).equals("hi") && s.charAt(i + 2) != 't') {
            c++;
            rec1(s, ans, i + 1);

        } else
            rec1(s, ans, i + 1);
    }
}
