package Array;

import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of array: ");
        int n = sc.nextInt();

        int sum = 0;
        int[] arr = new int[n];
        System.out.print("Enter The Element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Sum of Elements of Array: ");
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}

