// #4. Summation of two number.
package Basics;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no: ");
        int x = sc.nextInt();

        System.out.print("Enter the second no: ");
        int y = sc.nextInt();

        int sum = x + y;
        System.out.print("Sum of two Number is: ");
        System.out.println(sum);
    }
}
