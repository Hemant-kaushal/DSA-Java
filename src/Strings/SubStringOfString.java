package Strings;

public class SubStringOfString {
    public static void main(String[] args) {
        String s = "AnushikhaKumari";
        System.out.println(s.substring(1,s.length()-1));
        System.out.println(s.substring(0,1));             // Last index is not included.

        String st = "Gopi";
        int n = st.length();
        for(int i=0; i<n; i++) {
            for (int j=i+1; j<=n; j++) {
                System.out.println(st.substring(i, j));
            }
            System.out.println();
        }
    }
}
