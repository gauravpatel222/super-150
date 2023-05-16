package recursion;

public class countzeroes {
    public static void main(String[] args) {
        String s = "102030";
        System.out.println(count(s, 0));
    }

    public static int count(String s, int c) {
        if (s.isEmpty()) {
            return 1;
        }
        if (s.charAt(0) == '0') {
            return 1 + count(s.substring(1), c + 1);
        } else {
            return count(s.substring(1), c);
        }
    }
}
