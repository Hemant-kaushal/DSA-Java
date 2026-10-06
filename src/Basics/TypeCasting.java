// #6. ASCII Value and TypeCasting
package Basics;

public class TypeCasting {
    public static void main(String[] args) {
        // cahr to int
        char ch = 'A';
        int box = ch;           // IMPLICIT TypeCasting
        System.out.println(box);

        char ch2 = 'a';
        int box2 = ch2;
        System.out.println(box2);

        char ch3 = '1';
        int box3 = ch3;
        System.out.println(box3);

        // int to char
        int x = 67;
        char ch4 = (char)x;     // EXPLICIT TypeCasting
        System.out.println(ch4);

        int x1 = 99;
        char ch5 = (char)x1;
        System.out.println(ch5);


        // Operation in Characters to find ASCII value:
        char cr = 'b';
        System.out.println(cr+0);

        char cm = 'b';
        System.out.println(cm*cm);
    }
}
