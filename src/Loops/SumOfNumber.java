//#8.
package Loops;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int r, sum = 0;
        while (n!=0){
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        System.out.print((sum>0) ? sum : -sum);
    }
}
