package MultiDimentionalArrays;

public class ColumnWisePrint {
    public static void  main(String[]arg){
        int[][] arr = {{3,6,7,1}, {8,4,2,1}, {0,5,8,9}};
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
