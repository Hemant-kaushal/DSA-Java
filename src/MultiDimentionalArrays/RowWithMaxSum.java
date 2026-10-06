package MultiDimentionalArrays;

import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{20,4,6,8},{11,3,5,7},{3,5,7,9}};
        int maxRow = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
               sum += arr[i][j];
            }
            if (sum > maxRow){
                maxRow = sum;
                row = i;
            }
        }
        System.out.println("Row number: "+row+" Maximum Sum: "+maxRow);

    }
}
