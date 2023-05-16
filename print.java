package recursion;

public class print {
    public static void main(String[] args) {
        int n = 5;
        // check(n);
        System.out.println();
        // find(n);
        System.out.println();
        System.out.println(retfind(n));
    }

    public static void check(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        check(n - 1);
    }

    public static void find(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        find(n - 1);
        System.out.println(n);
    }

    public static int retfind(int n) {
        if (n == 1) {
            return 1;
        }
        return n + retfind(n - 1);

    }
}
