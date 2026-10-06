package Array;

import java.util.Scanner;

public class Segregate_0s_and_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        segregate0and1(arr);
        System.out.println("output: ");
        for(int x : arr){
            System.out.println(x+" ");
        }
    }
    static void segregate0and1(int[] arr){
        int n = arr.length;
        int  i=0; int j=n-1;
        while(i<j){
            if (arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if (arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
}
