public class count_say {
    public static void main(String[] args) {

        int n = 0;
        int x = 1;
        String ans = "1";
        while (x < n) {
            String s = "";
            int i = 0;
            int count = 1;
            while (i < ans.length()) {
                if (i < ans.length() - 1 && ans.charAt(i) == ans.charAt(i + 1)) {
                    count++;
                } else if (i == ans.length() - 1) {
                    s += String.valueOf(count) + ans.charAt(i);
                } else {
                    s += String.valueOf(count) + ans.charAt(i);
                    count = 1;
                }
                i++;
            }
            ans += s;
            x++;
        }
        System.out.println(ans);

    }
}
