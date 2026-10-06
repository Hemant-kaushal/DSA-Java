//#9.
package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int r, c = 0;
        while (n!=0){
            c = c*10;
            r = n%10;
            c = c+r;
            n = n/10;
        }
        System.out.print("The reverse number is "+c);
    }
}
