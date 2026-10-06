package Recursion;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        int n = 5;
        print(5);
    }
    public static void print(int n){
        if(n<1) return;
        System.out.println(n+" ");
        print(n-1);
        System.out.println(n+" ");
    }
}
