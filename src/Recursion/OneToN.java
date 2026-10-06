package Recursion;

import java.util.Scanner;

public class OneToN {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //print(1,n);
        print(n);
    }

    // Using 2 Variable "n" & "x"

//    public static void print(int x, int n){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1, n);
//    }


    // Using only one Variable: "n" by Initializing Globally.

//    public static void print(int x){
//        if(x>n) return;
//        System.out.print(x+" ");
//        print(x+1);
//    }

    // By Using Function Call back.
    public static void print(int n) {
        if (n==0) return;
        print(n - 1);
        System.out.print(n + " ");
    }
}


