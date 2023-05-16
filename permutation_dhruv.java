package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation_dhruv {

    public static void main(String[] args) {
        int ar[] = { 2, 1, 3 };

        ArrayList<List<Integer>> nee = new ArrayList<List<Integer>>();
        rec(nee, ar, new ArrayList<Integer>(), 0);
        System.out.println(nee);
    }

    // static void rec()
    static void rec(ArrayList<List<Integer>> nee, int[] ar, ArrayList<Integer> in, int si) {
        if (in.size() == ar.length) {
            ArrayList<Integer> mid = new ArrayList<Integer>(in);
            nee.add(mid);
            return;
        }
        for (int i = si; i < ar.length; i++) {
            if (in.contains(ar[i]))
                continue;
            // swap(ar,i,si);
            in.add(ar[i]);
            rec(nee, ar, in, si);
            in.remove(in.size() - 1);
            // rec(nee,ar,in,si+1);
            // swap(ar,i,si);

        }
    }

}
