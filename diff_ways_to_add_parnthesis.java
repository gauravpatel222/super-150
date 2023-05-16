import java.util.ArrayList;

public class diff_ways_to_add_parnthesis {
    public static void main(String[] args) {

        String s = "2*3-4*5";

        ArrayList<Integer> ans = rec(s);
        System.out.println(ans);

    }

    public static ArrayList<Integer> rec(String s) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char operator = s.charAt(i);
            if (operator == '-' || operator == '*' || operator == '+') {
                ArrayList<Integer> a1 = rec(s.substring(0, i));
                ArrayList<Integer> a2 = rec(s.substring(i + 1));

                for (int x : a1) {
                    for (int y : a2) {
                        if (operator == '-') {
                            ans.add(x - y);
                        }
                        if (operator == '*') {
                            ans.add(x * y);
                        }
                        if (operator == '+') {
                            ans.add(x + y);
                        }

                    }
                }

            }
        }
        if (ans.size() == 0)
            ans.add(Integer.parseInt(s.charAt(0) + ""));
        return ans;
    }
}
