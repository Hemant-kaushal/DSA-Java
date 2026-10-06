package IfElse;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Ternary Operator -> Condition ? Sach : Jooth
        System.out.println((n%2 == 0) ? "Even" : "odd");
    }
}
