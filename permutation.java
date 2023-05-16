package recursion;

public class permutation {
    public static void main(String[] args) {
        String s = "abc";
        permu(s, "");
    }

    public static void permu(String s, String p) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String t = p.substring(0, i);
            String g = p.substring(i, p.length());
            permu(s.substring(1), t + ch + g);
        }
    }
}
