package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int raw = sc.nextInt();
        System.out.print("Enter the colmun: ");
        int col = sc.nextInt();

        for (int i=1; i <=raw; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
