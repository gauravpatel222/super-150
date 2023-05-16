import java.util.ArrayList;

public class subarray_sum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(subarraySum(arr, 5, 0));

    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        list.add(1);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            sum += arr[i];

            while (sum > s) {
                sum -= arr[j];
                c = 1;
                j++;
            }

            // list.remove(0);
            if (c == 1) {
                list.remove(0);

                list.add(j + 1);
            }
            if (sum == s && s != 0) {
                list.add(i + 1);
                return list;
            }
        }
        list.remove(0);
        list.add(-1);
        return list;
    }
}
