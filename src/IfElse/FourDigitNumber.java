package IfElse;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();

        if(n > 999 && n < 10000) System.out.println("Is a 4 Digit Number");
        else System.out.println("Is Not a 4 Digit Number");
    }
}
