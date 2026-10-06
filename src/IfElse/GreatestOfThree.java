package IfElse;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no:  ");
        int a = sc.nextByte();

        System.out.print("Enter the second no:  ");
        int b = sc.nextByte();

        System.out.print("Enter the third no:  ");
        int c = sc.nextByte();

        if(a>=b && a>=c)
            System.out.println(a+" is Greatest number");
        else if(b>=a && b>=c)
            System.out.println(b+" is Greatest number");
        else System.out.println(c+" is Greatest number");
    }
}
