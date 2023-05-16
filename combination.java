import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class combination {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        helper(result, temp, n, k, 1);
        System.out.println(result);
    }

    private static void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int n, int k, int i) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i; j <= n; j++) {
            temp.add(j);
            helper(result, temp, n, k, j + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
