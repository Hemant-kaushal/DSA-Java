package LinkedList;

class ListNode{     // user define data type
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}

class DLL {
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(size == 0){
            System.out.println("error");
        }
        if(size == 1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteAtTail(){
        if(size == 0){
            System.out.println("error");
        }
        if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            if(tail != null) tail.next = null;
        }
        size--;
    }

    void insert(int idx, int val){
        if(idx<0 || idx > size){
            System.out.println("Error");
        }
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }

        ListNode a = new ListNode(val);
        ListNode temp = head;
        for(int i=1; i <= idx-1; i++){
            temp = temp.next;
        }
        a.next = temp.next;
        temp.next.prev = a;
        temp.next = a;
        a.prev = temp;
        size++;
    }

    void delete(int idx){
        if(idx<0){
            System.out.println("Error");
        }
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx > size){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for(int i=1; i <= idx; i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next = temp.prev;
        size--;
    }

    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void reverseDisplay(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedListClass {
    public static void main(String[] args){
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.reverseDisplay();
        list.deleteAtHead();
        list.deleteAtTail();
        list.display();
        list.insert(1,80);
        list.display();
        list.delete(1);
        list.display();
    }
}



