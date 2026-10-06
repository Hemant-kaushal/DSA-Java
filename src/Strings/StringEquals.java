package Strings;

public class StringEquals {
    public static void main(String[] arg){
        String s1 = new String("Loki");
        String s2 = new String("Loki");

//        if(s1 == s2) System.out.println("true");
//        else System.out.println("false");          //false

        if(s1.equals(s2)) System.out.println("true");
        else System.out.println("false");

//        Boolean result = s1.equals(s2);
//        System.out.println(result);
    }
}
