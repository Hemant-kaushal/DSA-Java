package IfElse;

import java.util.Scanner;

public class CoordinatesOfXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X Coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter Y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("Point is at the Origin");
        else if (x == 0 && y != 0)
            System.out.println("Point is on the Y axis");
        else if (x != 0 && y == 0)
            System.out.println("point is on the X axis");
        else if (x > 0 && y > 0)
            System.out.println("point on 1st Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("point on 2nd Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("point on 3rd Quadrant");
        else
            System.out.println("point on 4th Quadrant");
    }
}
