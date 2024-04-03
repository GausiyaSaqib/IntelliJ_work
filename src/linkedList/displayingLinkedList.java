package linkedList;

public class displayingLinkedList {
    public static void print(Node head){
        Node temp = head; // temp is at head
//        for (int i = 1; i <=5 ; i++) {
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        //Node a = new Node(100);
       // Node temp = a; // Shallow Copy
        // temp.val = 12; // temp have access to change value of a

        // Shallow Copy have same address

       // System.out.println(a);
       // System.out.println(temp);

//


        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(70);
        a.next = b; // linking
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        print(a); // from a to f
        System.out.println();
        print(c);  // printing from c to f


    }
}
