package IfElse;

import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Side:  ");
        int a = sc.nextByte();

        System.out.print("Enter the second Side:  ");
        int b = sc.nextByte();

        System.out.print("Enter the third Side:  ");
        int c = sc.nextByte();

        if (a+b > c && b+c > a && c+a > b) System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
    }
}
