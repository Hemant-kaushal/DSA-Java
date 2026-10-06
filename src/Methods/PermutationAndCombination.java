package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int fact(int x){
        int f = 1;
        for(int i = 1; i<=x; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int nCr = fact(n)/(fact(r)*fact(n-r));   // method call
        int nPr = fact(n)/fact(n-r);             // method call

        System.out.println(nCr+" "+nPr);
    }
}

