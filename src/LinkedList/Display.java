package LinkedList;

// Cut&Copy this class to File: LinkedListDataStructure.

public class Display {
    public static void displayRec(Node head){              // DISPLAY USING RECURSION
        if(head == null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);

//    public static void display(Node head){                // DISPLAY USING WHILE LOOP.
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }

//        for(Node temp=head; temp!=null; temp = temp.next){   // DISPLAY USING FOR LOOP.
//            System.out.print(temp.val+" ");
//        }
//        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);      // Head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Ab Liked krenge (Connect krenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        display(a);
        displayRec(a);
        System.out.println();

        System.out.println(get(a,3));
    }
    private static int get(Node head, int idx){
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
