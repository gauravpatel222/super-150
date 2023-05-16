import java.util.Scanner;

public class rat_maze {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        rec(n, m, "", 0, 0);
        System.out.print(c);

    }

    static int c = 0;

    public static void rec(int n, int m, String s, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            System.out.print(s + " ");
            c++;
            return;
        }
        if (i > n - 1 || j > m - 1)
            return;

        rec(n, m, s + "V", i + 1, j);

        rec(n, m, s + "H", i, j + 1);

    }
}
