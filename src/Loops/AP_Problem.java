// #3. for given AP - 2,5,8,11....
package Loops;

import java.util.Scanner;

public class AP_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of term: ");
        int n = sc.nextInt();

//        for(int i = 2; i <= 3*n-1; i+=3){
//            System.out.print(i+" ");
//        }

        int a = 2, d = 3;
        for(int i = 1; i <= n; i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
