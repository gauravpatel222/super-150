import java.util.Scanner;

public class boardpath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        rec(target, n, 1, "");
        System.out.println();
        System.out.print(c);
    }

    static int c = 0;

    public static void rec(int target, int n, int i, String s) {
        if (target == 0) {
            System.out.print(s + " ");
            c++;
            return;

        }
        if (target < 0)
            return;
        for (int k = i; k <= n; k++) {
            rec(target - k, n, k + 1, s + String.valueOf(k));
        }
    }
}
