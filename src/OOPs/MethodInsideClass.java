package OOPs;

public class MethodInsideClass {
    public static class Student {
        String name;
        int roll;
        double cgpa;
        void print(){
            System.out.println(name+" "+roll+" "+cgpa+" ");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Hemant";
        s1.roll = 17;
        s1.cgpa = 7.43;

        Student s2 = new Student();
        s2.name = "Prity";
        s2.roll = 37;
        s2.cgpa = 9.32;

        Student s3 = new Student();
        s3.name = "kaushal";
        s3.roll = 19;
        s3.cgpa = 5.5;

//        System.out.println("For Object s1: " + s1.name + " " + s1.roll + " " + s1.cgpa);
//        System.out.println("For Object s2: " + s2.name + " " + s2.roll + " " + s2.cgpa);
//        System.out.println("For Object s3: " + s3.name + " " + s3.roll + " " + s3.cgpa);

        s1.print();
        s2.print();
        s3.print();

        // We can direct print using Method Inside the class.
    }
}

