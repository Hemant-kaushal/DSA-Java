package Recursion;

public class ReverseIntrger {
    public static void reverse(int n, int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        reverse(n/10, (r*10)+(n%10));
    }

    public static void main(String[] args) {
        int n = 62875;
        reverse(n, 0);
//        int r=0;
//        while(n!=0){
//            r = r*10;
//            r = r + n%10;
//            n = n/10;
//        }
//        System.out.println(r);
    }
}
