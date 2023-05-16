public class obedient_string {
    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);
        String s = "abbb";
        rec(s, 0, "");
    }

    public static void rec(String s, int i, String ans) {
        if (i == s.length()) {
            System.out.print("true");
            return;
        }
        if (i == s.length() - 1 && s.charAt(i) == 'a') {
            System.out.print("true");
            return;
        }
        if (i == s.length() - 2 && s.substring(i, i + 2).equals("bb")) {
            System.out.print("true");
            return;
        }

        if (i < s.length() - 1 && s.charAt(i) == 'a') {
            if (s.charAt(i + 1) == 'a' || s.substring(i + 1, i + 3).equals("bb")) {
                // System.out.print("false");
                // return;
            } else {
                System.out.println("false");
                return;

            }
            rec(s, i + 1, ans);
        } else if (i < s.length() - 2 && s.substring(i, i + 2).equals("bb")) {
            if (s.charAt(i + 2) != 'a') {
                System.out.print("false");
                return;
            }
            rec(s, i + 2, ans);
        }

    }
}
