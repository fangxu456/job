import cvte.Subset;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Subset subset = new Subset();
        int[] A ={1,2,2};
        ArrayList<ArrayList<Integer>> a = subset.getSubsets(A,3);
        System.out.println(a);
    }



}
