import java.util.ArrayList;
import java.util.Stack;

public class validate_stack_sq {
    public static void main(String[] args) {
        int[] pushed = { 1, 2, 3, 4, 5 };
        int[] popped = { 4, 3, 5, 2, 1 };

        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while (i < pushed.length) {
            while (i < pushed.length && pushed[i] != popped[j]) {
                stack.push(pushed[i]);
                i++;

            }
            stack.push(popped[j]);
            System.out.println(stack.peek() + " " + popped[j]);
            while (!stack.isEmpty() && (stack.peek() == popped[j])) {

                j++;
                stack.pop();
            }
            i++;
            ArrayList<Integer> nee = new ArrayList<>();
            ArrayLi   
        }
        while (j < popped.length) {
            if (popped[j] != stack.pop()) {
                // return false;
                System.out.println("false");
            }
            j++;
        }
        System.out.println("true");
    }
}