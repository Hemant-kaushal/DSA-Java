// #3. Input from User.
package Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double pi = 3.1416;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double area = (4.0 / 3.0) * pi * radius * radius * radius; // use 4.0 and 3.0 for double
        System.out.print("Volume of Sphere: ");
        System.out.println(area);
    }
}
