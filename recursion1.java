package recursion;

public class recursion1 {
    public static void main(String[] args) {
        String s = "baaccde";
        System.out.println(find(s, ""));
    }

    public static String find(String s, String p) {
        if (s.isEmpty()) {
            System.out.println(p);
            return p;
        }
        if (s.charAt(0) != 'a') {
            return find(s.substring(1), p + s.charAt(0));
        } else
            return find(s.substring(1), p);
    }
}
