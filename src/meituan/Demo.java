package meituan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/12.
 * 第二题，建树，层次打印
 * 建树？？？
 */
public class Demo {
    public static class Tree{
        private int value;
        private int[] leaf;
    }
    public static void main(String[] args){
        /*HashMap<String, String> hashMap = new HashMap<>();
        while(in.hasNextLine()){
            String str = in.nextLine();
            hashMap.put(str.substring(0,str.indexOf(",")),str);
        }*/
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        Tree[] trees = new Tree[N];

        for(int i=0; i<N; i++) {
            String str = in.nextLine();
            String[] numList = str.split(" ");
            int[] a = new int[numList.length];
            trees[i] = new Tree();
            trees[i].value = Integer.parseInt(numList[0]);
            for (int j = 1; j < numList.length; j++) {
                a[j] = Integer.parseInt(numList[j]);
                trees[i].leaf = new int[100];
                trees[i].leaf[j-1] = a[j];
            }
        }
    }
}
