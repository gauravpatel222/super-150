public class first_neg {
    public static void main(String[] args) {
        char a = '0' + 97;
        System.out.println(a);
        int[] nums = { 1, 2, 3, 4, 5 };
        int index = 0;
        int k = 2;

        int si = 0;
        while (si < nums.length - k) {
            if (index >= si && index < si + k) {
                System.out.print(nums[index] + " ");
            } else if (index > si + k)
                System.out.print(0 + " ");
            else {
                index++;
                boolean check = true;
                while (check) {
                    if (nums[index] < 0) {
                        check = false;
                        break;
                    }

                    index++;
                }

                if (index >= si && index < si + k) {
                    System.out.print(nums[index] + " ");
                } else
                    System.out.print(0);

            }
            si++;

        }
        int ei = 0;
        int index1 = 0;
        int last = nums.length - 1;
        while (ei < k) {
            if (nums[last] < 0) {
                index1 = last;
            }
            last--;
            ei++;

        }
        if (index1 == 0) {
            System.out.print(0);
        } else
            System.out.println(nums[index1]);

    }
}