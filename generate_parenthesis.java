import java.util.ArrayList;
import java.util.Scanner;

public class generate_parenthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> ll = new ArrayList();
        rec(n, 0, 0, "", list, ll);
        System.out.println(ll);
        System.out.println(list);
        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.println(list.get(i));
        // }

    }

    public static void rec(int n, int open, int close, String s, ArrayList list, ArrayList<ArrayList<String>> ll) {
        if (open == n && close == n) {
            System.out.println(s);
            list.add(s);
            ll.add(new ArrayList(list));
            return;
        }
        if (open > n || close > n) {
            return;
        }
        if (open < n) {
            // list.add("(");
            rec(n, open + 1, close, s + "(", list, ll);
            // list.remove(list.size() - 1);
        }
        if (open > close) {
            // list.add(")");
            rec(n, open, close + 1, s + ")", list, ll);
            // list.remove(list.size() - 1);
        }
    }
}
