package recursion;

public class pow {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(pow(.00001, 2147));
        System.out.println(Integer.MAX_VALUE);
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1.00000;
        }
        return x * pow(x, n - 1);
    }

}
