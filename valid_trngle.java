import java.util.Arrays;

public class valid_trngle {
    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4 };

        Arrays.sort(a);
        int n = a.length;
        int c = 0;
        for (int i = n - 1; i >= 1; i--) {
            int left = 0, right = i - 1;
            int start = left;
            while (left < right) {
                int mid = (start + right) / 2;
                if (mid == start)
                    mid++;
                if (a[mid] + a[start] > a[i]) {
                    c = c + i - mid;
                    left++;
                    start = left;
                } else if (mid == right) {
                    left++;
                    start = left;
                } else if (a[mid] + a[start] <= a[i]) {
                    start = mid + 1;

                }

            }
        }
        System.out.println(c);
    }
}
