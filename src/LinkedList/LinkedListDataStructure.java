package LinkedList;

class Node {                   // CRATING USER DEFINE DATA TYPE
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Linkedlist{            // CRATING USER DEFINE DATA TYPE
    Node head;    // null
    Node tail;    // null
    int size = 0;

    int size(){
        return size;
    }

    void InsertAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void InsertAtHead(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void DeleteAtHead(){
        if(head == tail) {
            System.out.println("Liked is Empty");
            return;
        }
         head = head.next;
         size--;
    }

    int search(int val) {
        if (head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) return idx;
            temp = temp.next;                  // traverse form 0 to that val.
            idx++;
        }
        return -1;
    }

    void display() {                // DISPLAY USING WHILE LOOP.
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

     int get(int idx){
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void insert(int val, int idx){
        if(idx > size || idx < 0){
            System.out.println("Invalid Index");
        }
        if(idx == size) InsertAtTail(val);
        else if(idx == 0) InsertAtHead(val);
        else{
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    void delete(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;     // Actual delete.
        if(idx == size-1)               // when we want to delete last index.
            tail = temp;
        size--;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.InsertAtTail(11);
        ll.InsertAtTail(21);
        ll.InsertAtTail(31);
        ll.InsertAtTail(41);
        ll.display();
        System.out.println();
        ll.InsertAtHead(51);
        ll.display();
        System.out.println();
        ll.DeleteAtHead();
        ll.display();
        System.out.println();
        System.out.println(ll.search(41));
        System.out.println(ll.size());
        ll.insert(55,2);
        ll.display();
        System.out.println();
        System.out.println(ll.get(2));
        ll.delete(2); ll.display();
    }
}
