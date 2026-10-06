package IfElse;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Digit: ");
        int n = sc.nextInt();

        if (n>=0) System.out.println(n);
        else System.out.println(-n);
    }
}
