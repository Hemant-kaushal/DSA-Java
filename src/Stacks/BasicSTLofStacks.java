package Stacks;

import java.util.Stack;

public class BasicSTLofStacks {
    public static void main(String[] args){
        Stack<String> st = new Stack<>();       // Check for empty Stack.
        System.out.println(st.size() == 0);    // Check for empty Stack.
        st.push("Hemant");
        st.push("Rachit");
        st.push("Komal");
        st.push("Mayank");
        st.push("Lavish");
        st.push("Shashak");
        st.push("Shubham");
        System.out.println(st.size());        // Print Size of Stacks
        System.out.println(st);              // Print element  takes  T.C = O(n)  only for printing.
        st.pop();                            // Remove TopMost element.
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());       // Display the TopMost element.
        System.out.println(st.pop());       // It return the TopMost element and then remove it.
        String s = st.pop();               // Store TopMost element in String 's'
        System.out.println(st);
    }
}
