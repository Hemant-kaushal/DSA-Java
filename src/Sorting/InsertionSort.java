package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 9, 2, 3, 1, 6, 21, 0, 4};
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int elm: arr) System.out.print(elm+" ");

    }
}
