package recursion;

public class pallindrome {
    public static void main(String[] args) {
        String n = "12321";
        System.out.print(check(n, 0, 4));
    }

    public static boolean check(String s, int i, int j) {
        if (i == j) {
            return true;
        }
        return s.charAt(i) == (s.charAt(j)) && check(s, i + 1, j - 1);
    }
}
