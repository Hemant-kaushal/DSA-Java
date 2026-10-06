package OOPs;

class Students {
    String name;              // null
    private int roll;         // 0
    double cgpa;              // 0.0

    void print() {                                         // USE TO ACCESS PRIVATE VARIABLE (DATA).
        System.out.println(name + " " + roll + " " + cgpa + " ");
    }
    void setRoll(int x){
        roll = x;
    }


    // void PrivateMethodAccessor(){             USE TO ACCESS "Print() method" IF IT COULD BE "Private".
    //      print();
    // }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Students s = new Students();
            s.name = "Hemant";
            // s.roll = 23017;
            s.setRoll(23017);
            s.cgpa = 8.7;
            s.print();
    }
}
// WE CAN ALSO USE getter method TO ACCESS THE roll. (check in copy)