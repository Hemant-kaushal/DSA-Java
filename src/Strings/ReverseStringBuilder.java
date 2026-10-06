package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Rathore";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" Ranjan");
        System.out.println(sb);

//        sb.reverse();
//        System.out.println(sb);

//        int i=0, j = sb.length() -1;        // Reverse String using Two Pinters
//        while(i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i, temp2);
//            sb.setCharAt(j, temp1);
//            i++;
//            j--;
//        }
//        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1,'o');
        System.out.println(sb);
        sb.delete(3,6);          // 3 to 5
        System.out.println(sb);

        // Reverse a String :
        String st = "Hemant Kaushal";
        StringBuilder SB = new StringBuilder(st);
        SB.reverse();
        st = SB.toString();
        System.out.println(st);

    }
}
