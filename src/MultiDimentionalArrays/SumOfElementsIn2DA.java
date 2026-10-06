package MultiDimentionalArrays;

public class SumOfElementsIn2DA {
    public static void main(String[] args) {
        int[][] arr = {{2,5,7,8},{1,3,5,6,8},{4,6,8,0}};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum = arr[i][j] + sum;
            }
        }
        System.out.print(sum);
    }
}
