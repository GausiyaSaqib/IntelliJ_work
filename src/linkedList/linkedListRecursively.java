package linkedList;

public class linkedListRecursively {
    public static void displayRecursive(Node head){
        if(head == null) return;
        System.out.println(head.val);
        displayRecursive(head.next);
    }

//    public static void display(Node head){
//        if(head == null) return;
//        display(head.next);
//        System.out.println(head.val);
//    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(120);
        Node c = new Node(130);
        Node d = new Node(140);
        Node e = new Node(150);
        Node f = new Node(170);
        a.next = b; // linking
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        displayRecursive(a);
      //  display();
    }
}
