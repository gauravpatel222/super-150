public class chess_board {
    public static void main(String[] args) {

        int n = 3;
        rec("", 3, 0, 0);
        System.out.println(c);

    }

    static int c = 0;

    public static void rec(String s, int n, int i, int j) {
        String i1 = String.valueOf(i);
        String j1 = String.valueOf(j);
        if (i == n - 1 && j == n - 1) {
            s = s + "{" + i1 + "-" + j1 + "}";
            System.out.println(s + " ");
            c++;
            return;
        }
        if (i > n - 1 || j > n - 1)
            return;

        if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
            for (int k = 1; k < n; k++) {
                rec(s + "{" + i1 + "-" + j1 + "}" + "R", n, i, j + k);
            }
            for (int k = 1; k < n; k++) {
                rec(s + "{" + i1 + "-" + j1 + "}" + "R", n, i + k, j);
            }
        }
        rec(s + "{" + i1 + "-" + j1 + "}" + "K", n, i + 1, j + 2);
        rec(s + "{" + i1 + "-" + j1 + "}" + "K", n, i + 2, j + 1);
        if (i == j) {
            for (int k = 1; k < n; k++) {
                rec(s + "{" + i1 + "-" + j1 + "}" + "B", n, i + k, j + k);

            }
        }

    }
}
