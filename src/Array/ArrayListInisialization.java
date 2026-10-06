package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInisialization {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(6);
        arr.add(9);
        arr.add(12);
        System.out.println(arr.get(2));
        arr.set(2, 88);

        System.out.println(arr);

        int n = arr.size();             // arr.length
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        for(int elm : arr){
            System.out.print(elm+" ");
        }
        System.out.println();

        arr.add(78);

        arr.add(3, 100);
        System.out.println(arr);

        arr.remove(arr.size()-1);
        System.out.println(arr);

        //Collections.reverse(arr);
        int i=0; int j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
