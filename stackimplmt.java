import javax.swing.undo.StateEdit;

class stack {
    int[] data;
    private static int defaultss = 10;
    int ptr = -1;

    s.tack(int size) {
        this.data = new int[size];

    }

    stack() {
        this(defaultss);
    }

    public boolean push(int n) {
        if (ptr == data.length - 1) {
            return false;
        }
        ptr++;
        data[ptr] = n;
        return true;
    }

    public static int pop() {
        if (isempty()) {
            System.out.println("kuch dal to lai");
        }
        return data[ptr--];

    }

    public boolean isempty() {

        return ptr == -1;

    }

    public void peek() {
        System.out.println(data[ptr]);
    }

    public static int size() {
        return 0;
    }

}

public class stackimplmt {
    public static void main(String[] args) {
        stack list = new stack(5);
        list.push(1);
        list.push(2);
        list.push(22);
        System.out.println(list.pop());

    }
}
