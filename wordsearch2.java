import java.util.ArrayList;
import java.util.Scanner;

public class wordsearch2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = 1;
        int n = 1;
        int k1 = 5;

        /*
         * char[][] nums = { { 'o', 'a', 'a', 'n' },
         * { 'e', 't', 'a', 'e' },
         * { 'i', 'h', 'k', 'r' },
         * { 'i', 'f', 'l', 'v' }
         * };
         */
        char[][] nums = { { 'a' } };
        String[] words = { "b", "a" };
        boolean[][] check = new boolean[m][n];

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (nums[j][k] == (words[i].charAt(0))) {
                        rec(j, k, m, n, words[i], list, "", nums, 0, check);
                    }
                }
            }
        }
        System.out.print(list);

    }

    public static void rec(int j, int k, int m, int n, String s, ArrayList<String> list, String ans, char[][] nums,
            int count, boolean[][] check) {
        if (count == s.length()) {
            if (ans.equals(s)) {
                if (!list.contains(ans))
                    list.add(ans);
            }
            System.out.println(ans);
            return;
        }
        if (j < 0 || j > m - 1 || k < 0 || k > n - 1)
            return;

        if (count > s.length()) {
            return;
        }
        if (count == s.length()) {
            if (ans.equals(s)) {
                if (!list.contains(ans))
                    list.add(ans);
            }
            System.out.println(ans);
            return;
        }
        if (check[j][k] == false) {
            check[j][k] = true;
            rec(j + 1, k, m, n, s, list, ans + nums[j][k], nums, count + 1, check);
            // check[j][k] = false;
            rec(j - 1, k, m, n, s, list, ans + nums[j][k], nums, count + 1, check);
            // check[j][k] = false;
            rec(j, k + 1, m, n, s, list, ans + nums[j][k], nums, count + 1, check);
            // check[j][k] = false;
            rec(j, k - 1, m, n, s, list, ans + nums[j][k], nums, count + 1, check);

            check[j][k] = false;

        }
    }
}