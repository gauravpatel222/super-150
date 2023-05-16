class ll {
    node head;
    node tail;
    int size;

    class node {
        int val;
        node next;

        node(int n) {
            val = n;
            this.next = null;

        }

        node() {
            val = 21;
        }
    }

    public void addfirst(int n) {
        node newnode = new node(n);
        newnode.next = head;
        head = newnode;
        if (tail == null)
            tail = head;
        size++;
    }

    public void addlast(int n) {
        node newnode = new node(n);
        tail.next = newnode;
        tail = newnode;

    }

    public void insert(int n, int pos) {
        node newnode = new node(n);
        node temp = head;
        int i = 0;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        node temp1 = temp.next;
        temp.next = newnode;
        newnode.next = temp1;

    }

    public void reverse() {
        node curr = head;
        node prev = null;
        while (curr != null) {
            node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ---->  ");
            temp = temp.next;
        }
    }
}

public class start {
    public static void main(String[] args) {
        ll list = new ll();
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.addlast(9);
        list.insert(2, 2);
        list.display();
        System.out.println();
        list.reverse();
        list.display();

    }

}
