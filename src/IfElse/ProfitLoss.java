package IfElse;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your CP: ");
        int cp = sc.nextInt();
        System.out.print("Enter your SP: ");
        int sp = sc.nextInt();

//        if (cp > sp) System.out.println("loss is "+(cp-sp));
//        if (sp > cp) System.out.println("Profit is "+(sp-cp));
//        if (cp == sp) System.out.println("No Profit No Loss");

        if (cp > sp) System.out.println("loss is "+(cp-sp));
        else if (sp > cp) System.out.println("Profit is "+(sp-cp));
        else System.out.println("No Profit No Loss");
    }
}
