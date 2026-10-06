package MultiDimentionalArrays;

public class ReverseRowColumn {
    public static void  main(String[]arg){
        int[][] arr = {{3,6,7,1}, {8,4,2,1}, {0,5,8,9}};
        for(int i=arr.length-1; i>=0; i--){
            for(int j=arr[0].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
