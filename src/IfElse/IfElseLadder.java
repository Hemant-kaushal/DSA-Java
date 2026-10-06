package IfElse;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if (n%5 == 0 && n%3 == 0){
            System.out.println("Divisible by both");
        }
        else if (n%3 == 0) {
            System.out.println("Divisible by 3");
        }
        else if(n%5 == 0) {
            System.out.println("Divisible by 5");
        }
        else System.out.println("Nor Divisible by 5 nor 3");
    }
}
