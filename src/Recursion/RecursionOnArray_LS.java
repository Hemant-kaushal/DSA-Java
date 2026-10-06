package Recursion;

public class RecursionOnArray_LS {
    public static void main(String[] args) {
        int[] arr = {3,1,5,8,2,4};
        int ele = 8;
        System.out.println(exists(arr,ele,0));
    }
    public static boolean exists(int[] arr, int ele, int idx) {
        int n = arr.length;
        if (idx == n) return false;
        if (arr[idx] == ele) return true;
        return exists(arr, ele, idx+1);
    }
}
