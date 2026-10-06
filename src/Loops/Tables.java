// #2. Printing the Table any digit.
package Loops;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit: ");
        int n = sc.nextInt();

        for (int i = n; i <=n*10; i = i+n)
            System.out.print(i+" ");
    }
}
