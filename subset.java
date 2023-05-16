package recursion;

public class subset {
    public static void main(String[] args) {
        String s = "abc";
        check("", s);
        // System.out.println(retcheck("", s));

    }

    public static void check(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        check(p + s.charAt(0), s.substring(1));

        check(p, s.substring(1));

    }

}
