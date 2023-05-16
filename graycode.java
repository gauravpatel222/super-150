import java.util.ArrayList;

public class graycode {
    public static void main(String[] args) {
        int n = 2;
        ArrayList<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        while (n > 1) {
            ArrayList<String> helper = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                helper.add("0" + list.get(i));
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                helper.add("1" + list.get(i));

            }
            n--;
            list = helper;
        }
        System.out.println(list);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ans.add(rec(list.get(i)));
        }
        System.out.println(ans);
    }

    static int rec(String n) {
        String num = n;
        int dec_value = 0;

        // Initializing base value to 1,
        // i.e 2^0
        int base = 1;

        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }

        return dec_value;
    }

}
