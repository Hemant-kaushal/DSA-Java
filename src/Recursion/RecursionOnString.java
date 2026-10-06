package Recursion;

import java.util.ArrayList;

public class RecursionOnString {
    public static void main(String[] args) {
        // ArrayList of String
        ArrayList<String> al = new ArrayList<>();
        al.add("hemant");
        al.add("prity");
        al.add("tanishka");
        change(al);
        System.out.println(al);
    }
    public static void change(ArrayList<String> al){
        al.add("shubham");
    }
}
