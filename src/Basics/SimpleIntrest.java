// #5. Division of Different datatypes.

package Basics;

/*public class SimpleIntrest {
    public static void main(String[] args) {
        int p = 69, r = 2, t = 4;
        double si = p*r*t/100;
        System.out.println(si);
    }
}    // answer Should be 5.52 but it gives 5.0   that means we should change our datatype into double before calculating.
*/

public class SimpleIntrest {
    public static void main(String[] args) {
        int p = 69, r = 2, t = 4;
        double si = p * r * t / 100.0;         // we  change the datatype of 100 from int to double (100.0).
        System.out.println(si);
    }
}