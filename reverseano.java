package recursion;

public class reverseano {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(find7(n, 4));
    }

    public static int find7(int n, int m) {
        if (n == 0) {
            return 0;
        }
        return find7(n / 10, m - 1) + (n % 10) * (int) Math.pow(10, m);

    }
}
