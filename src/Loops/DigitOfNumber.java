// #7. Count Digit Of a Number
package Loops;

import java.util.Scanner;

public class DigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n!=0){
            n /= 10;      // n = n/10
            count++;
        }
        System.out.print("The Digit of a Number is "+count);
    }
}
