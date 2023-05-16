import java.util.Arrays;
import java.util.HashSet;

public class contest_mice {
    public static void main(String[] args) {
        int[] nums1 = { 2, 1 };
        int[] nums2 = { 1, 2 };
        int k = 1;

        int[] check = new int[k];
        int i = 0;
        int sum = 0;
        while (i < k) {
            check[i] = i;

            sum += nums1[i];
            i++;
        }
        while (i < nums1.length) {
            int min = 3987;
            int index = -1;
            for (int j = 0; j < check.length; j++) {
                if (min > nums1[check[j]] && nums1[check[j]] < nums1[i]) {
                    min = nums1[check[j]];
                    index = j;
                }

            }
            if (index != -1) {
                sum = sum - nums1[index];
                sum += nums1[i];
                check[index] = i;
            }
            i++;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int x = 0; x < check.length; x++) {
            set.add(check[x]);
            // System.out.println(check[x]);
        }
        check = new int[k];
        i = 0;
        int sum1 = 0;
        while (i < k) {
            if (!set.contains(i)) {
                check[i] = i;

                sum1 += nums2[i];

            }
            i++;
        }
        while (i < nums2.length) {
            if (!set.contains(i)) {
                int min = 3987;
                int index = -1;
                for (int j = 0; j < check.length; j++) {
                    if (min > nums2[check[j]] && nums2[check[j]] < nums2[i]) {
                        min = nums1[check[j]];
                        index = j;
                    }

                }
                if (index != -1) {
                    sum1 = sum1 - nums2[index];
                    sum1 += nums2[i];
                    check[index] = i;
                }
            }
            i++;
        }
        System.out.println(sum1);

    }

}
