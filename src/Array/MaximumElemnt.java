package Array;

import java.util.Scanner;

public class MaximumElemnt {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of element: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];                               // Integer.MIN_VALUE;
        System.out.println("The Maximum Element is: ");
        for(int i=0; i<n; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
