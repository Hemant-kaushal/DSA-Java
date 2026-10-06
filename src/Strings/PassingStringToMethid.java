package Strings;

public class PassingStringToMethid {
    public static void change(String x){
        x = "Raghav";
    }
    public static void main(String[] args) {
        String x = "Hemant";
        System.out.println(x);

        change(x);
        System.out.println(x);
    }
}
