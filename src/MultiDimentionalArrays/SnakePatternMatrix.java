package MultiDimentionalArrays;

public class SnakePatternMatrix {
    public static void  main(String[]arg){
        int[][] arr = {{3,6,7,1}, {8,4,2,1}, {0,5,8,9}, {3,2,6,2}, {1,3,5,6}};
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
