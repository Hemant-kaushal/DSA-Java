package IfElse;

import java.util.Scanner;

public class OddEven {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
