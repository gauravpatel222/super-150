import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class contest1 {
    public static void main(String[] args) {
        int num = 678;
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
        String a1 = "";
        String a2 = "";
        if (s.length() % 2 != 0)
            a2 = a2 + "0";
        for (int i = 0; i < s.length(); i++) {
            a1 += sorted.charAt(i);
            i++;
            if (i < s.length())
                a2 += sorted.charAt(i);

        }
        System.out.println(Integer.parseInt(a1) + Integer.parseInt(a2));
    }
}