package Array;

public class ReverseAraay {
    public static void main(String[] args) {
        System.out.print("Original Array: ");
        int[] arr = {2, 7, 9, 13, 7};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse Array: ");
        int n = arr.length;
        int i=0; int j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int element : arr)
            System.out.print(element+" ");
    }
}
