package linkedList;
class Node {
    int val;
    Node next;
    Node(int val){   // CONSTRUCTOR
        this.val = val;
        this.next = null; // but this is not required in java bcoz its bydefault present
    }
}
public class linkedNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; // linking
        b.next = c;
        c.next = d;
        d.next = e;
//        System.out.println(a.val); // printing value in different variable
//        System.out.println(b.val);
//        System.out.println(c.val);
//        System.out.println(d.val);
//        System.out.println(e.val);

        System.out.println(a.val); // printing value in terms of a
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);

    }
}
