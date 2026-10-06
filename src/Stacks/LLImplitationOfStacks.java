package Stacks;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Stack{
    Node head;
    int size;

    int peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }

    int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    void push(int ele){
        Node temp = new Node(ele);
        if(size == 0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size ++;
    }

    int size(){
        return size;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LLImplitationOfStacks {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);  st.push(30);  st.push(50);  st.push(70);  st.push(90);
        st.display();
        st.pop();
        st.display();
    }
}
