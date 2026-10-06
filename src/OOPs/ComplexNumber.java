package OOPs;

class CompNum{
    int x;
    int y;

    CompNum(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println(x+" +i"+y+" ");
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        CompNum c1 = new CompNum(23, 5);
        c1.print();
    }

}
