package recursion;

public class reverse {
    public static void main(String[] args) {
        String s = "jhffmnvf";
        System.out.println(print(s, ""));
        
        // print(s, "");

    }

    public static String print(String s, String p) {
        if (s.isEmpty()) {
            System.out.println(p);
            return "";
        }
        return print(s.substring(1), p) + s.charAt(0);

    }

    public static void find(String s, String p) {
        if (s.isEmpty()) {

            return;
        }
        find(s.substring(1), p);

        System.out.print(s.charAt(0));
    }

    
    }

}
