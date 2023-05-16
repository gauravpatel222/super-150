class leetcode {
    ListNode head;
    ListNode tail;
    // ListNode next;

    class ListNode {
        public int n;
        public ListNode next;

        // public ListNode next;
        ListNode(int n1) {
            n = n1;
            next = null;
        }

        public ListNode(int n2, int index) {
            n = n2;
            next = null;
        }
    }

    public void addelements(int n) {

        ListNode newnode = new ListNode(n);
        newnode.next = head;
        head = newnode;
        if (tail == null) {
            tail = head;
        }

    }

    public void display() {
        ListNode temp4 = head;
        while (temp4 != null) {
            System.out.println(temp4.n);
            temp4 = temp4.next;
        }
    }

    public void rotate() {
        int k = 2;
        while (k > 0) {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            // System.out.println(temp.n);
            ListNode tail = temp.next;
            temp.next = null;
            tail.next = head;
            head = tail;
            k--;
        }
    }
}

public class rotate_linked_list {
    public static void main(String[] args) {
        leetcode l = new leetcode();
        l.addelements(5);
        l.addelements(4);
        l.addelements(3);
        l.addelements(2);
        l.addelements(1);
        l.rotate();

        l.display();

    }
}
