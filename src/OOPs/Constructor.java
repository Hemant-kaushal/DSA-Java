package OOPs;

public class Constructor {
    public static class Car{
        String name;
        int price;

        Car(){                 // DEFAULT CONSTRUCTOR

        }
        Car(String s, int x){  // PARAMETRIZED CONSTRUCTOR : Use to easily initialize the Object.
            name = s;
            price = x;
        }
        Car(int x, String s){   // CONSTRUCTOR OVERLOADING
            name = s;
            price = x;
        }

        void print(){
            System.out.println(price+" "+name+" ");
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Honda", 500000);  // USE IN PARAMETRIZED CONSTRUCTOR
        c1.print();

        Car c2 = new Car(450000, "TATA");
        c2.print();

        Car c3 = new Car();       // USE IN DEFAULT CONSTRUCTOR
        c3.name = "Mehidra";
        c3.price = 600000;
        c3.print();
    }
}
