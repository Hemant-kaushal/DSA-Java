package Queues;

import java.util.LinkedList;

public class LLImplitationofQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(11); q.add(21); q.add(31); q.add(41); q.add(51);
        q.display();
        q.remove();
        System.out.println(q.remove());
        q.display();
        q.add(61);
        q.display();
    }
}
