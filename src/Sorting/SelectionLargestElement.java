package Sorting;

public class SelectionLargestElement {
    public static void main(String[] args) {
        int[] arr = {22, 6, -1, 17, 4, 0, 34, 6};
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Selection Sort
        for(int i=n-1; i>0; i--){
            int max = Integer.MIN_VALUE;
            int maxdx = 0;
            for(int j=0; j<=i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}


