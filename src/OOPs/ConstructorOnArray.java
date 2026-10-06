package OOPs;

public class ConstructorOnArray {
    public static class StudentData{
        String name;
        int roll;
        int[] marks;

        StudentData(int[] brr){         // Receive Length whole array : arr
            marks = brr;
        }
        StudentData(int s){             // Receive Length of array : 3
            marks = new int[s];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 8, 2};
        StudentData s1 = new StudentData(arr);
        arr[0] = 49;
        System.out.println(arr[0]);           // Shallow Copy
        StudentData s2 = new StudentData(3);
    }
}

