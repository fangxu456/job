package microsoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/10.
 */
public class Test3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();
        int[] a  = new int[N];
        ArrayList[] lists = new ArrayList[N];
        for(int i =0;i<N;i++){
            lists[i].add(in.nextInt());
            lists[i].add(in.nextInt());
            lists[i].add(in.nextInt());
            for(int j=0;j<(int)lists[i].get(2);j++){
                lists[i].add(in.nextInt());
                lists[i].add(in.nextInt());
            }
        }
        for(int i=0;i<N;i++){
            a[i]+=K*(int)lists[i].get(2);
            for(int j=0;j<(int)lists[i].get(2);j++){
                a[i]+=(int)lists[i].get(4+2*j);
            }
            System.out.println(a[i]);
        }
    }
}
