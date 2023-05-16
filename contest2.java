public class contest2 {
    public static void main(String[] args) {
        int n = 3;
        long no = 1 + (n - 1) * 2;

        long sum = (n) * (2 * 1 + (n - 1) * 2);

        sum = sum / 2;

        sum = sum * 2 - no;

        System.out.println(sum);

    }
}
