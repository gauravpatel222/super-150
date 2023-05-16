import java.util.ArrayList;

public class comb_3sum {
    public static void main(String[] args) {
        rev(1, new ArrayList<>(), 9);
    }

    public static void rev(int i, ArrayList list, int target) {

        if (target == 0 && list.size() == 3) {
            System.out.println(list);
            return;
        }

        for (int j = i; j <= 9; j++) {
            list.add(j);
            rev(j + 1, list, target - j);
            list.remove(list.size() - 1);

        }
    }

}
