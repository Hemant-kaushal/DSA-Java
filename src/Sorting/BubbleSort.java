package Sorting;

public class BubbleSort {
    public static void print(int[] arr){
        for(int elm : arr){
            System.out.print(elm+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 17, 4, 9, 5, -2, 0, 15, -1};
        print(arr);
        int n = arr.length;

        // Bubble Sort.
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted == true) break;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Sorted array:
        print(arr);

        /*
        int swaps = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps = 0;
                }
            }
            if (swaps==0) break;
        }
        // Sorted array:
        print(arr);
        */
    }
}
