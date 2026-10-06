package Array;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 54, 1, -2, 50};

        System.out.print("Element to be search: ");
        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;   // save found position
                break;       // stop loop

            }
        }
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: "+ index);

    }
}
