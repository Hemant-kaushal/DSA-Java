package Strings;

import java.util.Scanner;

public class ToatalNoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String s = "" + n;            // Sting s = Integer.toString(n);
        System.out.println(s.length());
    }
}
