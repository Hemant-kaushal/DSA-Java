package IfElse;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your digit: ");
        double n = sc.nextDouble();

        int x = (int)n;

        if(n-x == 0) System.out.println("Integer Number");
        else System.out.println("Not Integer Number");
    }
}
