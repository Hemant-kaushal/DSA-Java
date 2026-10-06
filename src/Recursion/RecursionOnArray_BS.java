package Recursion;

public class RecursionOnArray_BS {
    public static int search(int[] arr, int target, int low, int high) {
        if (low>high) return -1;
        int mid = low+high/2;
        if(arr[mid] == arr[target]) return mid;
        else if (arr[mid] > arr[target]) return search(arr, target, low, high-1);
        else return search(arr, target, low+1, high);
    }
    public static int main(String[] args) {
        int[] arr = {-4,2,4,9,19,33,43};
        int target = 43;
        int n = arr.length;
        return search(arr,target,0, n-1);
    }
}
