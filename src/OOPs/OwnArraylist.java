package OOPs;

class Arraylist{
    int[] arr;
    int size = 0;
    int idx = 0;

    Arraylist(int capacity){
        arr = new int[capacity];
    }

    int capacity(){
        return arr.length;
    }

    void add(int x){
        if(idx == arr.length){
            capasityIncrease();
        }
        arr[idx++] = x;
        size++;
    }

    void capasityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    int get(int indx){
        return arr[indx];
    }

    void set(int idx,int val){
        arr[idx] = val;
    }

    void removeFromEnd(){
        size--;
        idx--;
    }

    void remove(int index){
        for(int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        idx++;
    }

    void insert(int index, int val){
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }
        if(index == arr.length){
            capasityIncrease();
        }
        for(int i=size; i>index; i--){
           arr[i] = arr[i-1];
        }
        arr[index] = val;
        size++;
        idx++;
    }

}

public class OwnArraylist {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(4);
        System.out.println(arr.capacity());
        arr.add(23); arr.add(32); arr.add(15);
        System.out.println(arr.size);
        System.out.println(arr.get(1));
        arr.add(60); arr.add(43); arr.add(41);
        System.out.println(arr.get(2));
        arr.display();
        System.out.println();
        arr.removeFromEnd();
        arr.display();
        System.out.println();
        arr.insert(2, 25);
        arr.display();
        arr.remove(3);
        System.out.println();
        arr.display();
    }
}
