package BinaryTrees;

import java.util.Queue;
import java.util.LinkedList;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}


public class Imlementation {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(levels(a));
    }
    public static int size(Node root){
//        if(root == null) return 0;
//        int leftSize = size(root.left);
//        int rightSize = size(root.right);
//        return 1 + leftSize + rightSize;

        // Using Ternary operator:
        return (root == null) ? 0 :  1 + size(root.left) + size(root.right);
    }

    public static int sum(Node root){
        // Using Ternary operator:
        return (root == null) ? 0 :  root.val + sum(root.left) + sum(root.right);
    }

    public static int product(Node root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);              // Left ki sari value print kr dega with recursion magic.
        display(root.right);             // Right ki sari value print kr dega with recursion magic.
    }


}

