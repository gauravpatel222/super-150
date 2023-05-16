import java.util.ArrayList;
import java.util.Scanner;

public class k_knight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 2;
        int ans = 0;
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
        boolean[][] check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                path(0, 0, n, i, j, ll, check);
            }
        }
        System.out.println(c);
    }

    static int c = 0;

    public static void path(int i, int j, int n, int i1, int j1, ArrayList<ArrayList<Integer>> ll, boolean[][] check) {

        if (i < 0 || j < 0 || i > n - 1 || j > n - 1)
            return;
        if (check[i][j] == true)
            return;
        if (i1 + 1 == i && j1 + 2 == j) {
            return;
        }
        if (i1 + 2 == i && j1 + 1 == j) {
            return;
        }
        if (i == i1 && j == j1) {

        } else {

            String s = "{" + i1 + "-" + j1 + "}" + "{" + i + "-" + j + "}";
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(j);
            list.add(i1);
            list.add(j1);
            check[i][j] = true;
            if (!ll.contains(list)) {
                ll.add(new ArrayList<>(list));
                System.out.println(s);
                c++;
            }

            // String s="{"+"-"+"}"+"{"+"-"+"}";

        }

        path(i, j + 1, n, i1, j1, ll, check);
        path(i + 1, j, n, i1, j1, ll, check);

    }
}
