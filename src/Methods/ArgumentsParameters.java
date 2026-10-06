package Methods;

public class ArgumentsParameters {

//    public static void max(int a, int b, int c){      // Parametres
//        if(a >= b && c >= b) System.out.println(a);
//        if(b >= a && b >= c) System.out.println(c);
//        else System.out.println(c);
//    }
//
//    public static void main(String[] args) {
//        max(2,4,6);                                // Argurements
//    }

    public static int max(int a, int b, int c){      // Parametres
        if(a >= b && c >= b) return a;
        if(b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(max(9,4,6));     // Argurements
    }
}
