package Recursion;

public class GlobalVariable {
//    public static void main(String[] args) {
//        int x = 10;
//        fun();
//    }
//    public static void fun(){
//        System.out.println(x);
//    }
    // Gives Error becouse 'x' is local variable and only operate from same method.


//    static int x = 10;                      // Static means Sharable variable. this method can be accessible from anywhere.
//    public static void main(String[] args){
//       fun();
//       System.out.println(x);
//    }
//    public static void fun(){              // Any method can change the value of Globle variable.
//       x = 20;
//    }


    static int x = 10;
    public static void main(String[] args){
        fun();
        x = 78;
        System.out.println(x);
        int x = 25;                       // Preference of Local Variable is always Grater.
        System.out.println(x);
        x = 45;
    }
    public static void fun(){
        x = 20;
    }

}
