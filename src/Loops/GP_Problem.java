// #4. Given GP - 1,2,4,8....
package Loops;

import java.util.Scanner;

public class GP_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of term: ");
        int n = sc.nextInt();

        int a = 1, r = 2;
        for(int i = 1; i <= n; i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
