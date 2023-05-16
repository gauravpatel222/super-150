import java.util.ArrayList;

public class pancake_sorting {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 3 };

        int last = arr.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        while (last > 0) {
            int max = 0;
            int maxpos = 0;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > max) {
                    max = Math.max(max, arr[i]);
                    maxpos = i;
                }
            }
            if (maxpos != last) {
                swap(0, maxpos, list, arr);
                swap(0, last, list, arr);
            }
            last--;
        }
        System.out.println(list);
        // return list;

    }

    public static void swap(int start, int last, ArrayList<Integer> list, int[] arr) {
        if (start == last)
            return;
        int size = last - start + 1;
        list.add(size);
        for (int i = start; i < last; i++) {
            int temp = arr[last];
            arr[last] = arr[i];
            arr[i] = temp;
            last--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
