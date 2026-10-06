package Methods;

public class PassByVlaueAndRefrence {
    public static void change(){
        int x = 10;
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change();
        System.out.println(x);
    }
}
