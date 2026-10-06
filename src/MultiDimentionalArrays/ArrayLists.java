package MultiDimentionalArrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(4); a.add(12); a.add(11);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2); b.add(9); b.add(4);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(34); c.add(8); c.add(33); c.add(22);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        System.out.println(arr);

        // TO Print Proper way:
//        for(int i=0; i<arr.size(); i++){
//            for(int j=0; j<arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        for(ArrayList<Integer> list: arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) ans.get(i).add(1); // arr[i][j] = 1;
                else {
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1); // val = arr[i-1][j] + arr[i-1][j-1]
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }
}

