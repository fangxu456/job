package wap;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/10.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int P = in.nextInt();
        int[] a = new int[(int)Math.pow(M,3)];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        int[] L = new int[N];
        int[][] b = new int[N][a.length];
        for(int j=0;j<N;j++){
            L[j] = in.nextInt();
            System.out.println(L[j]);
            for(int k=0;k<Math.pow(L[j],3);k++){
                b[j][k]=in.nextInt();
            }
        }


    }
}
