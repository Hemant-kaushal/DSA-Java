// #5. Prime Number or Composite Number.
package Loops;

import java.util.Scanner;

public class BreakStatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        boolean flag = true;   // means prime number

        for(int i = 2; i <= Math.sqrt(n); i++){              // i <= n-1 : last tk loop chlega time complexity increses
                                                            // i <= n/2 : half tk loop chlega
            if(n%i == 0){
                flag = false;  // means composite number
                break;
            }
        }
        if(n == 1) System.out.println("Neither Prime nor Composite");
        else if(flag==false) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}
