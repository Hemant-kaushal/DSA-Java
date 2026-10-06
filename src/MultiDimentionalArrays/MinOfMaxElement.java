package MultiDimentionalArrays;

public class MinOfMaxElement {
    public static void main(String[] args) {
        int[][] arr = {{20,4,6,8},{11,3,5,7},{3,5,7,21}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            if(max<min){
                min = max;
            }
        }
        System.out.println(min);

    }
}
