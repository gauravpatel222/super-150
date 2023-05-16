public class count_prime {
    public static void main(String[] args) {
        int n = 100;
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == false) {
                for (int k = 2; k * i < prime.length; k++) {
                    prime[k * i] = true;
                }
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == false)
                System.out.println(i);
        }
    }
}
