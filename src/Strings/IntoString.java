package Strings;

import java.util.Scanner;

public class IntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String s = ""; // Empty String
        //s = s+n;
        String s = Integer.toString(n);
        System.out.println(s);
    }
}
