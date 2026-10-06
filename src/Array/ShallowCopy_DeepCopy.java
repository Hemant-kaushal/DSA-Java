package Array;

import java.util.Arrays;

public class ShallowCopy_DeepCopy {
    public static void main(String[] arg){
        int[] x = {10, 7, 5, 12};
//        int[] arr = x;                    // arr is the Shallow Copy of x
//        arr [1] = 55;                     // changing arr also changes x (because both point to same memory)
//        System.out.print(x[1]);

        int[] y = Arrays.copyOf(x,x.length);   // deep copy       Arrays.copyOf() : This is built in function.
        y [2] = 100;
        System.out.println(x[2]);
        System.out.println(y[2]);
    }
}
