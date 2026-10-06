package LinkedList;

// Cut&Copy this class to File: Display.

public class NodeOfLinkedList {
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

        System.out.println(e.val);
        System.out.println(a.next.next.next.val);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
    }
}
