package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Nod{
    int val;
   Nod left;
   Nod right;

   Nod(int val){
       this.val = val;
   }
}

class Pair{
    Nod node;
    int level;

    Pair(Nod node, int level){
        this.node = node;
        this.level = level;
    }
}

public class Traversal {
    public static void main(String[] args){
        Nod a = new Nod(3);
        Nod b = new Nod(4);
        Nod c = new Nod(2);
        Nod d = new Nod(-1);
        Nod e = new Nod(1);
        Nod f = new Nod(6);
        Nod g = new Nod(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        levelOrder(a);
        KthLevel(a, 0, 0);
    }
    public static void preorder(Nod root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Nod root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Nod root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

//        public static void levelOrder(Node root){
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while(q.size() > 0){
//            Node front = q.remove();
//            System.out.print(front.val+" ");
//            if(front.left != null) q.add(front.left);
//            if(front.right != null) q.add(front.right);
//        }
//        System.out.println();

    public static void levelOrder(Nod root){
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root,0));
        while(q.size() > 0){
            Pair front = q.remove();
            if(front.level != currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left != null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right, front.level+1));
        }
        System.out.println();
    }

    private static void KthLevel(Nod root, int level, int k){
        if(root == null) return;
        if(level==k) System.out.println(root.val+" ");
        KthLevel(root.left, level+1, level);
    }
}
