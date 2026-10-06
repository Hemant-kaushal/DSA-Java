package OOPs;

import java.util.Scanner;

public class UserDefineDataType {
    public static class Student{        // Defining User Data Type Using Class (Khud ka ek data type bna liye hai jisme collection of data types hai.)
        String name;
        int roll;
        double cgpa;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();     // Declaration of Object  (Access of Object)
        s1.name = "Hemant";             // Initialization of Object
        s1.roll = 17;
        s1.cgpa = 7.43;

        Student s2 = new Student();     // Declaration of another Object
        s2.name = "Prity";              // Initialization of Object
        s2.roll = 37;
        s2.cgpa = 9.32;

        Student s3 = new Student();
        s3.name = "kaushal";
        s3.roll = 19;
        s3.cgpa = 5.5;
        System.out.print("The Updated cgpa of object s3: ");
        s3.cgpa = sc.nextDouble();

        System.out.println("For Object s1: "+s1.name+" "+s1.roll+" "+s1.cgpa);  // TO Print Object using dot operator.
        System.out.println("For Object s2: "+s2.name+" "+s2.roll+" "+s2.cgpa);
        System.out.println("For Object s3: "+s3.name+" "+s3.roll+" "+s3.cgpa);

        System.out.println("The CGPA of Object s3: "+s3.cgpa);
    }

}
