package Array;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
//        int[] x = {11, 44, 31, 1, -7};
//        System.out.println("The lenght of given array: "+x.length);   // Length of array = x.array
//        for (int i=0; i < x.length; i++) {                            // index = 0 to n-1
//            System.out.print(x[i]+" ");
//        }


//        int i = 0;                                 // Inisialisation of Array Using While Loop
//        while(i<=4){
//            System.out.print(x[i]+" ");
//            i++;
//        }


        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];

//        for (int i=0; i<7; i++){
//            System.out.print(arr[i]+" ");      // Default Value
//        }
        System.out.println("Enter the Values: ");
        for(int i=1; i<5; i++){
          arr[i] = sc.nextInt();                // Assign Value

        }
        System.out.print("The Values you Entered: ");
        for(int i=1; i<5; i++){
            System.out.print(arr[i]+" ");           // Printing
        }
    }
}
