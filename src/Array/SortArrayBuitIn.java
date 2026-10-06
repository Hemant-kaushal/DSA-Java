package Array;

import java.util.Arrays;

public class SortArrayBuitIn {
    public static void main(String[] args) {
        int[] arr = {10, -3, 6, 12, 3, 0};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
