package OOPs;

public class PassingClassesToMethod {
    public static class Car{
        String name;
        int price;
        String type;
        int engine;
        double length;
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Scorpio";
        c1.price = 1100000;
        c1.type = "SUV";
        c1.engine = 750;
        c1.length = 4.3;

        change(c1);

        System.out.println(c1.price);
    }
    public static void change(Car x){      // PASSING OBJECT TO METHOD.
        x.price = 1200000;
    }
    // => When we send Classes or Objects to Method then it should be "Pass by Reference".
}
