package MultiDimentionalArrays;

public class ForEachLoop {
    public static void  main(String[]arg){
        int[][] arr = {{3,6,7,1}, {8,4,2,1}, {0,5,8,9}};
        for(int[] a: arr){
            for(int ele: a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
