package Recursion;

import Strings.SubStringOfString;

public class RecursionOnArray {
    public static void main(String[] args) {
        int[] arr = {3,1,5,8,2,4};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr, int idx){
        int n = arr.length;
        if(idx == n) return;
        System.out.print(arr[idx]+" ");    // Print 1 to n
        recPrint(arr,idx+1);
        System.out.print(arr[idx]+" ");    // Print n to 1
    }
}

