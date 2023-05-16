import java.util.Stack;

public class sum_sub_ranges {
    public static void main(String[] args) {

        int nums[] = { 4, -2, -3, 4, 1 };
        Stack<Integer> stack = new Stack<>();
        int[] pr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                stack.push(i);
                pr[i] = -1;
                continue;

            }
            pr[i] = stack.peek();
            stack.push(i);
        }
        while (!stack.isEmpty())
            stack.pop();
        int[] next = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                stack.push(i);
                next[i] = nums.length;
                continue;

            }
            next[i] = stack.peek();
            stack.push(i);
        }
        int ans = 0;

        // finding next greater and prvious greater....
        while (!stack.isEmpty())
            stack.pop();
        int[] prg = new int[nums.length];
        int[] nextg = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                stack.push(i);
                prg[i] = -1;
                continue;

            }
            prg[i] = stack.peek();
            stack.push(i);
        }
        while (!stack.isEmpty())
            stack.pop();
        // finding next grter
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                stack.push(i);
                nextg[i] = nums.length;
                continue;

            }
            nextg[i] = stack.peek();
            stack.push(i);
        }
        for (int i = 0; i < nums.length; i++)
            System.out.print(nextg[i]);
        System.out.println();
        // finding avg of min and max
        for (int i = 0; i < nums.length; i++) {
            int left = i - pr[i];
            int right = next[i] - i;
            ans -= (left * right) * nums[i];
            System.out.println(ans);
        }
        for (int i = 0; i < nums.length; i++) {
            int left = i - prg[i];
            int right = nextg[i] - i;
            ans += (left * right) * nums[i];
            System.out.println(ans);
        }
        System.out.println(ans);
        // return ans;

    }
}
/*
 * if(children>money){
 * return -1;
 * }
 * if(money<8)
 * int no=money/8;
 * int rem=money%8;
 * 
 * if(no>0&&rem==4){
 * no=no-1;
 * 
 * }
 * if(rem==0){
 * if(children==no){
 * return no;
 * }
 * else return children;
 * }
 * if(no<=children){
 * return no;
 * }
 * return children-1;
 */