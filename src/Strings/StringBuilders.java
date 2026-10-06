package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());

        s.append("Ramesh");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());

        s.setCharAt(1,'o');
        System.out.println(s);

        String t = s.toString();
        System.out.println(t);

        s.append(" what are you doing? I just like your voice and expression on your face.");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());

        s.append("200");
        System.out.println(s.length()+" "+s.capacity());
    }
}
