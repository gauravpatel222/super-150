public class pallindrome_strings {
    public static void main(String[] args) {
        String s = "naan";
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; i + j < s.length() && i - j >= 0; j++) {
                if (s.charAt(i + j) != s.charAt(i - j))
                    break;
                c++;
            }
        }

        for (double i = .5; i < s.length(); i++) {
            for (double j = .5; i + j < s.length() && i - j >= 0; j++) {
                if (s.charAt((int) (i + j)) != s.charAt((int) (i - j)))
                    break;
                c++;
            }

        }
        System.out.println(c);
    }
}