package linkedList;
class SLL {
    Node head;
    Node tail;
    int size;

    void insert_at_end(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insert_at_head(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if(idx == 0){
            insert_at_head(val);
            return;
        }
        if(idx == size){
            insert_at_end(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid Index");
            return;
        }

        Node temp = new Node(val);
        Node x = head;
            for (int i = 1; i <= idx-1; i++) {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}


    public class insertIndexInMiddle {
        public static void main(String[] args) {
            SLL list = new SLL();
            list.insert_at_end(10);
            list.insert_at_end(20);
            list.insert_at_end(30);
            list.insert_at_end(40);
            list.display();
            list.insert(2,100);
            list.display();
            list.insert(4,80);
            list.display();
            list.insert(10,50);


        }

    }

