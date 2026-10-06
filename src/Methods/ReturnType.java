package Methods;

public class ReturnType {

    public static int value(int a){
        System.out.println("Hemant Kaushal");
        if(a > 0) return 9;
        else return 0;
    }

    public static void main(String[] args) {
        int x = value(-5);
        System.out.println(x + 3);
    }
}
