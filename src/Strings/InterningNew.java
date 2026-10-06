package Strings;

public class InterningNew {
    public static void main(String[] args) {
        String s = "hemant";
        s = "radhe radhe";
        System.out.println(s);

//        String S1 = "Hemant";
//        String S2 = "Hemant";
//        System.out.println(S1==S2);  // true

        String S1 = new String ("Hemant");
        String S2 = new String ("Hemant");
        System.out.println(S1==S2);               // false
        System.out.println(S1.equals(S2));

    }
}
