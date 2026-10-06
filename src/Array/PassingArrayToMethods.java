package Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[]  x = {32, 54, 76, 12};
        System.out.println(x[2]);

        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x){
        x[2] = 99;
    }
}
